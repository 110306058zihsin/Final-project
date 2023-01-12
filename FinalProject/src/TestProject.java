

//爬進子網頁算權重
//相關關鍵字 class EIaa9b

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestProject
 */
@WebServlet("/TestProject")
public class TestProject extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TestProject() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		if (request.getParameter("keyword") == null) {
			String requestUri = request.getRequestURI();
			request.setAttribute("requestUri", requestUri);
			request.getRequestDispatcher("Search.jsp").forward(request, response);
			return;
		}

		GoogleQuery google = new GoogleQuery();

		HashMap<String, String> webPage = google.query(request.getParameter("keyword"));

		KeywordList keywords = new KeywordList();

		keywords.animation();

		
		CalcScore calc = new CalcScore(webPage, keywords);

		HashMap<Double, String> score = calc.calcScore();

		List<Double> retVal = calc.sort(score);
		
		HashMap<String, String> relate = google.relate(request.getParameter("keyword"));
		System.out.println();
		

		// test 排序完後的分數
		for (Double b : retVal) {
			System.out.println(b);
		}


		String[][] s = new String[retVal.size()][2];

		request.setAttribute("query", s);

		int num = 0;
		for (int i = 0; i < retVal.size(); i++) {
			String value = score.get(retVal.get(i));
			String key = webPage.get(value);

			s[num][0] = key;
			s[num][1] = value;
			System.out.printf("%s,%s\n", key, value);

			num++;
		}
		
		
		String[][] r = new String[relate.size()][2];

		request.setAttribute("relate", r);

		int n = 0;
		for (String relateUrl:relate.keySet()) {
			String title = relate.get(relateUrl);
			String url = relateUrl;

			r[n][0] = title;
			r[n][1] = url;
			System.out.printf("%s,%s\n", title, url);

			n++;
		}
		request.getRequestDispatcher("resultPage.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
