import java.io.IOException;
import java.util.ArrayList;




public class WebPage {
	
	String url;
	String title;
	public WordCounter counter;
	public double score;
	
	public WebPage(String url,String title){
		this.title=title;
		this.url = url;
		this.counter = new WordCounter(url);	
	}
	
	public WebPage(String url){
		this.url = url;
		this.counter = new WordCounter(url);	
	}
	
	public void setScore(ArrayList<Keyword> keywords) throws IOException{
		score = 0;
		
		for(Keyword k:keywords) {
			score+=k.weight*counter.countKeyword(k.name);
		}
//		1. calculate score

	}
	public void  setTitle(String title) {
		this.title=title;
	}
	
	public double getScore() {
		return score;
	}
}
