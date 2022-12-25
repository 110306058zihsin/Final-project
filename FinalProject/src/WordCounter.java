


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.net.SocketTimeoutException;

import java.net.URL;
import java.net.URLConnection;

public class WordCounter {

	private String urlStr;
    private String content;
    
    public WordCounter(String urlStr){
    	this.urlStr = urlStr;
    }
    
    private String fetchContent() throws IOException{
		URL url = new URL(this.urlStr);
        
		URLConnection conn = url.openConnection();
		conn.setRequestProperty("User-agent", "Chrome/107.0.5304.107");//
		
		
		InputStream in = conn.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in,"UTF-8"));
	
		String retVal = "";
	
		String line = null;
		
		while ((line = br.readLine()) != null){
		    retVal = retVal + line + "\n";
		}
	
		return retVal;
    }
    
    public int countKeyword(String keyword) throws IOException{
		if (content == null){
		    content = fetchContent();
		}
		
		//To do a case-insensitive search, we turn the whole content and keyword into upper-case:
		content = content.toUpperCase();
		keyword = keyword.toUpperCase();
	
		int retVal = 0;
		int fromIdx = 0;
		int found = -1;
	
		while ((found = content.indexOf(keyword, fromIdx)) != -1){
		    retVal++;
		    fromIdx = found + keyword.length();
		}
	
		return retVal;
    }
}

//=======
// private String urlStr;
//    private String content;
//    
//    public WordCounter(String urlStr){
//     this.urlStr = urlStr;
//    }
//    
//    private String fetchContent() throws IOException{
//     String retVal = "";
//     try {
//   URL u = new URL(urlStr);
//
//   URLConnection conn = u.openConnection();
//
//   conn.setRequestProperty("User-agent", "Chrome/7.0.517.44");
//   conn.setReadTimeout(10000);
//   conn.setConnectTimeout(10000);
//   InputStream in = conn.getInputStream();
//
//   InputStreamReader inReader = new InputStreamReader(in,"utf-8");
//
//   BufferedReader bufReader = new BufferedReader(inReader);
//   String line = null;
//
//   while((line=bufReader.readLine())!=null)
//   {
//    retVal+=line;
//
//   }
//  } catch (IOException e) {
//   //e.printStackTrace();
//  }
//     
//  return retVal;
//    }
//    
//    public int countKeyword(String keyword) throws IOException{
//  if (content == null){
//      content = fetchContent();
//  }
//  
//  //To do a case-insensitive search, we turn the whole content and keyword into upper-case:
//  content = content.toUpperCase();
//  keyword = keyword.toUpperCase();
// 
//  int retVal = 0;
//  int fromIdx = 0;
//  int found = -1;
// 
//  while ((found = content.indexOf(keyword, fromIdx)) != -1){
//      retVal++;
//      fromIdx = found + keyword.length();
//  }
//    System.out.println(urlStr);
//  return retVal;
//    }
//}
//>>>>>>> 089e8fb4ef4e3a7783b968cba639fa0c9edbf28a
