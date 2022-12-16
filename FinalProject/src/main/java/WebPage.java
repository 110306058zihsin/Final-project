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
}
