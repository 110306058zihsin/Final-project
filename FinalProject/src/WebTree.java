
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebTree {
	public WebNode root;

	public WebTree(WebPage page) {
		this.root = new WebNode(page);
	}

	public WebTree buildTree(WebNode startNode) throws IOException {

		String rootUrl = startNode.getPage().url;

		String retVal = "";
		URL u = new URL(rootUrl);

		ArrayList<String> childUrl = new ArrayList<String>();

		URLConnection conn = u.openConnection();

		
		conn.setRequestProperty("User-agent", "Chrome/107.0.5304.107");

		InputStream in = conn.getInputStream();

		InputStreamReader inReader = new InputStreamReader(in, "UTF-8");
		BufferedReader bufReader = new BufferedReader(inReader);
		String line = null;

		while ((line = bufReader.readLine()) != null) {
			retVal += line;
		}
		Document doc = Jsoup.parse(retVal);

		Elements aTag = doc.select("a");
		try {
			for (Element e : aTag) {
				String tryUrl = e.attr("href");

				if (tryUrl.startsWith("http")) {
					tryUrl.replaceAll(" ", "%20");
					String urlstr = URLDecoder.decode(tryUrl, "UTF-8");
					URL url = new URL(urlstr);
					HttpURLConnection con = (HttpURLConnection) url.openConnection();
					conn.setRequestProperty("User-agent", "Chrome/107.0.5304.107");
					int state = con.getResponseCode();

//					
					if (state == 200) {
						childUrl.add(urlstr);
					}
				}

				if (childUrl.size() == 3) {
					break;
				}

			}
		} catch (Exception e) {
			// System.out.println(e);
		}
		for (String url : childUrl) {
			WebPage webPage = new WebPage(url);
			startNode.addChild(webPage);
		}

		WebTree tree = new WebTree(startNode.getPage());
		return tree;

	}

	public double getTreeScore() {
		return root.getNodeScore();
	}

}
