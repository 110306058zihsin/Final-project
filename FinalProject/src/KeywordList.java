import java.util.ArrayList;

public class KeywordList {
	/**
	 * To store provided keywords.
	 */

	private ArrayList<Keyword> lst;

	public KeywordList() {
		lst = new ArrayList<Keyword>();
	}

	public String filter(String input) {
		// to rebuild the keyword list by user's option
		String s = "動漫";
		lst.clear();
		switch (input) {
		case "campus":
			campus();
			s = "青春/校園";
			break;
		case "fantasy":
			fantasy();
			s = "奇幻/科幻";
			break;
		case "action":
			action();
			s = "動作/冒險";
			break;
		case "comedy":
			comedy();
			s = "喜劇";
			break;
		case "thriller":
			s = "懸疑/驚悚";
			thriller();
			break;
		case "sports":
			s = "運動/熱血";
			thriller();
			break;
		default:
			animation();
			break;
		}
		return s;
	}

	public void animation() {
		lst.add(new Keyword("動漫", 20));
		lst.add(new Keyword("アニメ", 5));
		lst.add(new Keyword("動畫", 20));
		lst.add(new Keyword("アニメーション", 5));
		lst.add(new Keyword("番", 20));
		lst.add(new Keyword("漫畫", 20));
		lst.add(new Keyword("漫画", 20));
		lst.add(new Keyword("第一季", 15));
		lst.add(new Keyword("第二季", 15));
		lst.add(new Keyword("第三季", 15));
		lst.add(new Keyword("劇場版", 20));
		lst.add(new Keyword("新番", 20));
		lst.add(new Keyword("輕改", 10));
		lst.add(new Keyword("聲優", 5));
		lst.add(new Keyword("巴哈姆特", 10));
		lst.add(new Keyword("票房", 5));
		lst.add(new Keyword("動畫瘋", 10));
		lst.add(new Keyword("漫改", 10));
		lst.add(new Keyword("木棉花", 5));
		lst.add(new Keyword("東立", 5));
		lst.add(new Keyword("劇情", 10));
		lst.add(new Keyword("ストーリー", 5));
		lst.add(new Keyword("東映", 5));
		lst.add(new Keyword("吉卜力", 5));
//		lst.add(new Keyword("動漫", 5));
//		lst.add(new Keyword("アニメ", 5));
//		lst.add(new Keyword("動畫", 5));
//		lst.add(new Keyword("アニメーション", 5));
//		lst.add(new Keyword("番", 5));
//		lst.add(new Keyword("漫畫", 4));
//		lst.add(new Keyword("漫画", 4));
//		lst.add(new Keyword("劇場版", 4));
//		lst.add(new Keyword("新番", 4));
//		lst.add(new Keyword("輕改", 3));
//		lst.add(new Keyword("聲優", 3));
//		lst.add(new Keyword("巴哈姆特", 3));
//		lst.add(new Keyword("票房", 3));
//		lst.add(new Keyword("興行収入", 3));
//		lst.add(new Keyword("動畫瘋", 3));
//		lst.add(new Keyword("漫改", 2));
//		lst.add(new Keyword("木棉花", 2));
//		lst.add(new Keyword("東立", 2));
//		lst.add(new Keyword("劇情", 1));
//		lst.add(new Keyword("ストーリー", 1));
//		lst.add(new Keyword("東映", 1));
//		lst.add(new Keyword("吉卜力", 1));

//		lst.add(new Keyword("animation", 5));
//		lst.add(new Keyword("anime", 5));
		lst.add(new Keyword("manga", 5));
//		lst.add(new Keyword("OP", 4));
//		lst.add(new Keyword("ED", 4));
//		lst.add(new Keyword("OST", 4));
		lst.add(new Keyword("OVA", 3));
		lst.add(new Keyword("netflix", 3));
		lst.add(new Keyword("animax", 3));
		lst.add(new Keyword("Ani-One", 1));
		lst.add(new Keyword("MAPPA", 1));
		lst.add(new Keyword("Jump", 1));
	}

	public void campus() {
		lst.add(new Keyword("校園", 15));
		lst.add(new Keyword("浪漫", 15));
		lst.add(new Keyword("ロマンチック", 15));
		lst.add(new Keyword("戀愛", 15));
		lst.add(new Keyword("恋愛", 15));
		lst.add(new Keyword("れんあい", 15));
		lst.add(new Keyword("青春", 15));
		lst.add(new Keyword("愛", 10));
		lst.add(new Keyword("喜歡", 10));
		lst.add(new Keyword("好きです", 10));
		lst.add(new Keyword("社團", 10));
		lst.add(new Keyword("高中生", 10));
		lst.add(new Keyword("高校生", 10));
		lst.add(new Keyword("大學生", 10));
		lst.add(new Keyword("大学生", 10));
		lst.add(new Keyword("學生", 10));
		lst.add(new Keyword("学生", 10));
		lst.add(new Keyword("戀人", 5));
		lst.add(new Keyword("同學", 1));
		lst.add(new Keyword("クラスメート人", 1));
		lst.add(new Keyword("情", 1));
		lst.add(new Keyword("吻", 1));
		
		lst.add(new Keyword("campus", 15));
		lst.add(new Keyword("romance", 15));
		lst.add(new Keyword("romantic", 15));
		lst.add(new Keyword("affection", 10));
		lst.add(new Keyword("student", 10));
		lst.add(new Keyword("couple", 5));
		lst.add(new Keyword("lover", 5));
		lst.add(new Keyword("classmate", 1));
		lst.add(new Keyword("relationship", 1));
		lst.add(new Keyword("love", 1));
		lst.add(new Keyword("kiss", 1));
	}

	public void fantasy() {
		lst.add(new Keyword("奇幻", 15));
		lst.add(new Keyword("科幻", 15));
		lst.add(new Keyword("SF", 15));
		lst.add(new Keyword("太空", 5));
		lst.add(new Keyword("外星", 5));
		lst.add(new Keyword("宇宙", 5));
		lst.add(new Keyword("地球", 5));
		lst.add(new Keyword("異世界", 5));
		lst.add(new Keyword("魔法", 5));
		lst.add(new Keyword("穿越", 5));
		lst.add(new Keyword("經典", 5));
		lst.add(new Keyword("機器", 5));
		lst.add(new Keyword("妖", 1));
		lst.add(new Keyword("怪物", 1));
		lst.add(new Keyword("巫", 1));
		lst.add(new Keyword("神", 1));
		lst.add(new Keyword("鬼", 1));
		lst.add(new Keyword("龍", 1));
		
		lst.add(new Keyword("fantasy", 15));
		lst.add(new Keyword("sci-fi", 15));
		lst.add(new Keyword("science fiction", 15));
		lst.add(new Keyword("alien", 5));
		lst.add(new Keyword("space travel", 5));
		lst.add(new Keyword("time travel", 5));
		lst.add(new Keyword("magic", 5));
		lst.add(new Keyword("power", 5));
		lst.add(new Keyword("sorcerer", 1));
		lst.add(new Keyword("robot", 1));
		lst.add(new Keyword("monster", 1));
		lst.add(new Keyword("fairy", 1));
		lst.add(new Keyword("tale", 1));
		lst.add(new Keyword("myth", 1));
		lst.add(new Keyword("god", 1));
	}

	public void action() {
		lst.add(new Keyword("動作", 15));
		lst.add(new Keyword("アクション", 15));
		lst.add(new Keyword("冒險", 15));
		lst.add(new Keyword("アドベンチャー", 15));
		lst.add(new Keyword("戰爭", 5));
		lst.add(new Keyword("戰鬥", 5));
		lst.add(new Keyword("諜", 1));
		lst.add(new Keyword("武", 1));
		lst.add(new Keyword("特效", 1));
		lst.add(new Keyword("特技", 1));
		lst.add(new Keyword("賽車", 1));
		
		lst.add(new Keyword("action", 15));
		lst.add(new Keyword("adventure", 15));
		lst.add(new Keyword("war", 5));
		lst.add(new Keyword("spy", 1));
		lst.add(new Keyword("martial art", 1));
		lst.add(new Keyword("blast effect", 1));
		lst.add(new Keyword("special effect", 1));
	}

	public void comedy() {
		lst.add(new Keyword("喜劇", 15));
		lst.add(new Keyword("きげき", 15));
		lst.add(new Keyword("コメディ", 15));
		lst.add(new Keyword("幽默", 10));
		lst.add(new Keyword("搞笑", 10));
		lst.add(new Keyword("有趣", 10));
		lst.add(new Keyword("黑色幽默", 1));
		lst.add(new Keyword("日常", 1));
		lst.add(new Keyword("笑", 1));
		

		lst.add(new Keyword("comedy", 15));
		lst.add(new Keyword("sitcom", 15));
		lst.add(new Keyword("romcom", 15));
		lst.add(new Keyword("funny", 5));
		lst.add(new Keyword("hilarious", 5));
		lst.add(new Keyword("humor", 5));
	}

	public void thriller() {
		lst.add(new Keyword("懸疑", 15));
		lst.add(new Keyword("サスペンス", 15));
		lst.add(new Keyword("驚悚", 15));
		lst.add(new Keyword("スリラー", 15));
		lst.add(new Keyword("恐怖", 15));
		lst.add(new Keyword("ホラー", 15));
		lst.add(new Keyword("燒腦", 10));
		lst.add(new Keyword("推理", 10));
		lst.add(new Keyword("謀殺", 10));
		lst.add(new Keyword("犯罪", 10));
		lst.add(new Keyword("殺人", 10));
		lst.add(new Keyword("靈異", 1));
		lst.add(new Keyword("駭人", 1));
		lst.add(new Keyword("鬼片", 1));
		lst.add(new Keyword("顫慄", 1));
		lst.add(new Keyword("嚇", 1));
		lst.add(new Keyword("毛骨悚然", 1));

		lst.add(new Keyword("thriller", 15));
		lst.add(new Keyword("suspense", 15));
		lst.add(new Keyword("horror", 15));
		lst.add(new Keyword("murder", 10));
		lst.add(new Keyword("detective", 10));
		lst.add(new Keyword("crime", 10));
		lst.add(new Keyword("supernatural", 10));
		lst.add(new Keyword("terrify", 1));
		lst.add(new Keyword("horrify", 1));
	}
	
	public void sports() {
		lst.add(new Keyword("運動", 15));
		lst.add(new Keyword("うんどう", 15));
		lst.add(new Keyword("競技", 15));
		lst.add(new Keyword("コンペ", 15));
		lst.add(new Keyword("熱血", 10));
		lst.add(new Keyword("少年", 10));
		lst.add(new Keyword("籃球", 1));
		lst.add(new Keyword("羽球", 1));
		lst.add(new Keyword("排球", 1));
		lst.add(new Keyword("網球", 1));
		lst.add(new Keyword("桌球", 1));
		lst.add(new Keyword("自行車", 1));
		lst.add(new Keyword("游泳", 1));
		
		lst.add(new Keyword("sports", 15));
		lst.add(new Keyword("compete", 15));
		lst.add(new Keyword("athletic", 10));
		lst.add(new Keyword("on fire", 10));
		lst.add(new Keyword("warm blood", 10));
		lst.add(new Keyword("hot-blooded", 10));
		lst.add(new Keyword("juvenile", 10));
		lst.add(new Keyword("teenager", 10));
		lst.add(new Keyword("basketball", 1));
		lst.add(new Keyword("badminton", 1));
		lst.add(new Keyword("volleyball", 1));
		lst.add(new Keyword("tennis", 1));
		lst.add(new Keyword("table tennis", 1));
		lst.add(new Keyword("bike", 1));
		lst.add(new Keyword("bicycle", 1));
		lst.add(new Keyword("swimming", 1));
	}

	public ArrayList<Keyword> getKeywordList() {
		return lst;
	}

	public void add(Keyword k) {
		lst.add(k);
	}

	public void remove(Keyword k) {
		lst.remove(lst.indexOf(k));
	}
}
