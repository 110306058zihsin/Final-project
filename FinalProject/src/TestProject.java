
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

		HashMap<String, String> webPage = google.query(request.getParameter("keyword"));// query 裡面到時候要看怎麼連前端使用者輸入

		KeywordList keywords = new KeywordList();

		keywords.animation();
		keywords.campus();
		keywords.fantasy();
		keywords.action();
		keywords.thriller();
		keywords.sports();
//
		CalcScore calc = new CalcScore(webPage, keywords);

		HashMap<Double, String> score = calc.calcScore();

		List<Double> retVal = calc.sort(score);

		// test 排序完後的分數
//			System.out.println(score.keySet());

//			for(Double b:retVal) {
//				System.out.println(b);
//			}
//		

//		HashMap<String, String> query = new HashMap<String, String>();
//		for (int i = 0; i < retVal.size(); i++) {
//			String url = score.get(retVal.get(i));
//			String title = webPage.get(url);
//			// query.put(title,url);
//			System.out.printf("%s：%s\n", title, url);
//		}

		String[][] s = new String[webPage.size()][2];

		request.setAttribute("query", s);

		int num = 0;
		for (int i = 0; i < retVal.size(); i++) {
			String value = score.get(retVal.get(i));
			String key = webPage.get(value);

			s[num][0] = key;
			s[num][1] = value;

			num++;
		}

		request.getRequestDispatcher("resultPage.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
