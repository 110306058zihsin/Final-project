import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CalcScore {

	private HashMap<String, String> webPage;
	private ArrayList<Keyword> keywords;

	public CalcScore(HashMap<String, String> webPage, KeywordList lst) {
		this.webPage = webPage;
		keywords = lst.getKeywordList();
	}

	public HashMap<Double, String> calcScore() throws UnsupportedEncodingException {

		HashMap<Double, String> score = new HashMap<Double, String>();

		ArrayList<WebPage> rootPages = new ArrayList<>();

		for (String url : webPage.keySet()) {
//			String urlstr =  URLDecoder.decode(url.substring(7), "UTF-8");
			
			rootPages.add(new WebPage(url, webPage.get(url)));
			
		}
		for(WebPage page:rootPages) {//
			System.out.print(page.url+"\n");
		}
//		
//		return score;
		for (WebPage rootPage : rootPages) {
			try {
				rootPage.setScore(keywords);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println(rootPage.score);//
			score.put(rootPage.score, rootPage.url);
		}
		return score;
	}

	
	public List<Double> sort(HashMap<Double, String> score) {
		List<Double> retVal = new ArrayList<Double>();
		for (Double sc : score.keySet()) {
			retVal.add(sc);
		}
		Collections.sort(retVal, Collections.reverseOrder());
		return retVal;
	}

}
