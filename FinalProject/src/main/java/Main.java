import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {

		GoogleQuery google = new GoogleQuery();

		HashMap<String, String> webPage = google.query("漫畫");
		
		KeywordList keywords=new KeywordList();
		
		keywords.animation();

		CalcScore calc = new CalcScore(webPage,keywords );

		HashMap<Double, String> score = calc.calcScore();
		
		List<Double> retVal = calc.sort(score);
		
		
		
			System.out.println(score.keySet());
			for(Double b:retVal) {
				System.out.println(b);
			}
		
		
		for(int i=0;i<retVal.size();i++) {
			String url=score.get(retVal.get(i));
			String title=webPage.get(url);
			System.out.printf("%s：%s\n",title,url);
		}
		
	}
}
