import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GoogleQuery {
	
	//public String searchKeyword;//
	//public String url;//
	//public String content;//
	
	public GoogleQuery()
	{
		//this.searchKeyword = searchKeyword;//
		//this.url = "http://www.google.com/search?q="+searchKeyword+"&oe=utf8&num=20";//
	}
	
	private String fetchContent(String url) throws IOException
	{
		String retVal = "";

		URL u = new URL(url);
		URLConnection conn = u.openConnection();
		//set HTTP header
		conn.setRequestProperty("User-agent", "Chrome/107.0.5304.107");
		InputStream in = conn.getInputStream();

		InputStreamReader inReader = new InputStreamReader(in, "UTF-8");
		BufferedReader bufReader = new BufferedReader(inReader);
		String line = null;

		while((line = bufReader.readLine()) != null)
		{
			retVal += line;
		}
		return retVal;
	}
	public HashMap<String, String> query(String searchKeyword) throws IOException
	{
		String[] splitStr = searchKeyword.split(" ");
		if (splitStr.length > 1) {
			String comb = "";
			for (int i = 0; i < splitStr.length; i++) {
				comb += splitStr[i] + "+";
			}
			searchKeyword = comb;
		}
		if (!searchKeyword.contains("動漫")) {
			searchKeyword += "動漫";
		}

		
		String url = "http://www.google.com/search?q=" + searchKeyword + "&oe=utf8&num=20";
		System.out.println("url: " + url);

		String content = fetchContent(url);
		HashMap<String, String> retVal = new HashMap<String, String>();

		
		/* 
		 * some Jsoup source
		 * https://jsoup.org/apidocs/org/jsoup/nodes/package-summary.html
		 * https://www.1ju.org/jsoup/jsoup-quick-start
 		 */
		
		//using Jsoup analyze html string
		Document doc = Jsoup.parse(content);
		
		//select particular element(tag) which you want 
		Elements lis = doc.select("div");
		lis = lis.select(".kCrYT");
		
		for(Element li : lis)
		{
			try 
			{
				String citeUrl = li.select("a").get(0).attr("href");
				if (citeUrl.startsWith("/url?q=")) {
					citeUrl = citeUrl.replace("/url?q=", "");
				}
				String[] splittedString = citeUrl.split("&sa=");
				if (splittedString.length > 1) {
					citeUrl = splittedString[0];
				}
				String title = li.select("a").get(0).select(".vvjwJb").text();
				
				if(title.equals("")) 
				{
					continue;
				}
				String urlstr=URLDecoder.decode(citeUrl,"UTF-8");
				citeUrl.replaceAll(" ", "%20");

				System.out.println("Title: " + title + " , url: " + urlstr);
				
				//put title and pair into HashMap
				retVal.put(urlstr, title);

			} catch (IndexOutOfBoundsException e) 
			{
//				e.printStackTrace();
			}
		}
		return retVal;
	}
	
	

}
