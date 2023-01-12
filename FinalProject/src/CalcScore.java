

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

	public HashMap<Double, String> calcScore() throws IOException {

		HashMap<Double, String> score = new HashMap<Double, String>();

		// 新增tree array
		ArrayList<WebTree> trees = new ArrayList<WebTree>();

		ArrayList<WebPage> rootPages = new ArrayList<WebPage>();

		for (String url : webPage.keySet()) {

			rootPages.add(new WebPage(url, webPage.get(url)));

		}
		

		for (WebPage rootPage : rootPages) {

			

			WebTree tree = new WebTree(rootPage);
			tree.buildTree(tree.root);
			tree.root.setNodeScore(keywords);

			
			trees.add(tree);



			// test 每個網頁的權重

		
			double treeScore = tree.getTreeScore();
			if (treeScore >= 100) {
				
				System.out.println(treeScore+":"+rootPage.title);
				
				score.put(treeScore, rootPage.url);

			}

		
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
