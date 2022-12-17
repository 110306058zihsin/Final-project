import java.io.IOException;
import java.util.ArrayList;




public class WebPage {
	
	String url;
	String decodeURL;
	String title;
	public WordCounter counter;
	public double score;
	
	public WebPage(String decodeURL,String url, String title){
		this.decodeURL=decodeURL;
		this.url = url;
		this.title = title;
		this.counter = new WordCounter(decodeURL);	
	}
	
	public void setScore(ArrayList<Keyword> keywords) throws IOException{
		score = 0;
		
		for(Keyword k:keywords) {
			score+=k.weight*counter.countKeyword(k.name);
		}
//		1. calculate score

	}
	
	public double getScore() {
		return score;
	}
}
//=======
//public class WebPage {
// public String url;
// public String name;
// public WordCounter counter;
// public double score;
// 
// public WebPage(String url,String title){
//  this.url = url;
//  this.counter = new WordCounter(url);
//  this.name = title;
// }
// 
// public String getUrl() {
//  return url;
// }
//
// public void setUrl(String url) {
//  this.url = url;
// }
//
//	public double getScore() {
//		return score;
//	}
//
// public void setScore(ArrayList<Keyword> keywords) throws IOException{
//  score = 0;
//  for(Keyword k : keywords){ 
//   score+=counter.countKeyword(k.name)*k.getWeight();
//   System.out.println(score+"|"+name+"|"+k.name);
//   if(score<-50) {
//    break;}
//   }
// }
// 
//}
//>>>>>>> 089e8fb4ef4e3a7783b968cba639fa0c9edbf28a
