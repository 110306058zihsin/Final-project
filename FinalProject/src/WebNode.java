import java.io.IOException;
import java.util.ArrayList;

public class WebNode {
	private WebPage rootPage;
	private ArrayList<WebPage> children=new ArrayList<WebPage>();
	private double nodeScore;
	
	public WebNode(WebPage webPage) {
		this.rootPage=webPage;
		
	}
	
	public double setNodeScore(ArrayList<Keyword> keywords) throws IOException {
		rootPage.setScore(keywords);
		nodeScore=rootPage.score;
		for(WebPage p:children) {
			p.setScore(keywords);
			nodeScore+=p.score;
		}
		return nodeScore;
	}
	
	public void addChild(WebPage child) {
		children.add(child);
	}
	
	public WebPage getPage() {
		return rootPage;
	}
	
	public double getNodeScore() {
		return nodeScore;
	}
	
}
