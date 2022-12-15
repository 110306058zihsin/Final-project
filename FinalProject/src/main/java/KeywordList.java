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
		lst.add(new Keyword("動漫", 5));
		lst.add(new Keyword("アニメ", 5));
		lst.add(new Keyword("動畫", 5));
		lst.add(new Keyword("アニメーション", 5));
		lst.add(new Keyword("番", 5));
		lst.add(new Keyword("漫畫", 4));
		lst.add(new Keyword("漫画", 4));
		lst.add(new Keyword("劇場版", 4));
		lst.add(new Keyword("新番", 4));
		lst.add(new Keyword("輕改", 3));
		lst.add(new Keyword("聲優", 3));
		lst.add(new Keyword("巴哈姆特", 3));
		lst.add(new Keyword("票房", 3));
		lst.add(new Keyword("興行収入", 3));
		lst.add(new Keyword("動畫瘋", 3));
		lst.add(new Keyword("漫改", 2));
		lst.add(new Keyword("木棉花", 2));
		lst.add(new Keyword("東立", 2));
		lst.add(new Keyword("劇情", 1));
		lst.add(new Keyword("ストーリー", 1));
		lst.add(new Keyword("東映", 1));
		lst.add(new Keyword("吉卜力", 1));

		lst.add(new Keyword("animation", 5));
		lst.add(new Keyword("anime", 5));
		lst.add(new Keyword("manga", 5));
		lst.add(new Keyword("OP", 4));
		lst.add(new Keyword("ED", 4));
		lst.add(new Keyword("OST", 4));
		lst.add(new Keyword("OVA", 3));
		lst.add(new Keyword("netflix", 3));
		lst.add(new Keyword("animax", 3));
		lst.add(new Keyword("Ani-One", 1));
		lst.add(new Keyword("MAPPA", 1));
		lst.add(new Keyword("Jump", 1));
	}

	public void campus() {
		lst.add(new Keyword("浪漫", 5));
		lst.add(new Keyword("ロマンチック", 5));
		lst.add(new Keyword("戀愛", 5));
		lst.add(new Keyword("恋愛", 5));
		lst.add(new Keyword("れんあい", 5));
		lst.add(new Keyword("愛", 5));
		lst.add(new Keyword("喜歡", 4));
		lst.add(new Keyword("好きです", 4));
		lst.add(new Keyword("校園", 5));
		lst.add(new Keyword("青春", 5));
		lst.add(new Keyword("社團", 4));
		lst.add(new Keyword("高中生", 4));
		lst.add(new Keyword("高校生", 4));
		lst.add(new Keyword("大學生", 4));
		lst.add(new Keyword("大学生", 4));
		lst.add(new Keyword("學生", 4));
		lst.add(new Keyword("学生", 4));
		lst.add(new Keyword("同學", 3));
		lst.add(new Keyword("クラスメート人", 3));
		lst.add(new Keyword("戀人", 3));
		lst.add(new Keyword("情", 2));
		lst.add(new Keyword("吻", 2));
		
		lst.add(new Keyword("romance", 5));
		lst.add(new Keyword("romantic", 5));
		lst.add(new Keyword("campus", 5));
		lst.add(new Keyword("affection", 4));
		lst.add(new Keyword("love", 4));
		lst.add(new Keyword("student", 4));
		lst.add(new Keyword("classmate", 4));
		lst.add(new Keyword("couple", 3));
		lst.add(new Keyword("relationship", 3));
		lst.add(new Keyword("lover", 3));
		lst.add(new Keyword("kiss", 2));
	}

	public void fantasy() {
		lst.add(new Keyword("奇幻", 5));
		lst.add(new Keyword("科幻", 5));
		lst.add(new Keyword("SF", 5));
		lst.add(new Keyword("太空", 4));
		lst.add(new Keyword("外星", 4));
		lst.add(new Keyword("宇宙", 4));
		lst.add(new Keyword("地球", 4));
		lst.add(new Keyword("異世界", 3));
		lst.add(new Keyword("魔法", 3));
		lst.add(new Keyword("穿越", 3));
		lst.add(new Keyword("經典", 3));
		lst.add(new Keyword("機器", 3));
		lst.add(new Keyword("妖", 2));
		lst.add(new Keyword("怪物", 2));
		lst.add(new Keyword("巫", 2));
		lst.add(new Keyword("神", 2));
		lst.add(new Keyword("鬼", 2));
		lst.add(new Keyword("龍", 2));
		
		lst.add(new Keyword("fantasy", 5));
		lst.add(new Keyword("sci-fi", 5));
		lst.add(new Keyword("science fiction", 5));
		lst.add(new Keyword("alien", 4));
		lst.add(new Keyword("space travel", 3));
		lst.add(new Keyword("time travel", 3));
		lst.add(new Keyword("magic", 3));
		lst.add(new Keyword("power", 3));
		lst.add(new Keyword("sorcerer", 2));
		lst.add(new Keyword("robot", 2));
		lst.add(new Keyword("monster", 2));
		lst.add(new Keyword("fairy", 2));
		lst.add(new Keyword("tale", 2));
		lst.add(new Keyword("myth", 2));
		lst.add(new Keyword("god", 2));
	}

	public void action() {
		lst.add(new Keyword("動作", 5));
		lst.add(new Keyword("アクション", 5));
		lst.add(new Keyword("冒險", 5));
		lst.add(new Keyword("アドベンチャー", 5));
		lst.add(new Keyword("戰爭", 4));
		lst.add(new Keyword("戰鬥", 4));
		lst.add(new Keyword("諜", 3));
		lst.add(new Keyword("武", 3));
		lst.add(new Keyword("特效", 2));
		lst.add(new Keyword("特技", 2));
		lst.add(new Keyword("賽車", 1));
		
		lst.add(new Keyword("action", 5));
		lst.add(new Keyword("adventure", 5));
		lst.add(new Keyword("war", 4));
		lst.add(new Keyword("spy", 3));
		lst.add(new Keyword("martial art", 3));
		lst.add(new Keyword("blast effect", 2));
		lst.add(new Keyword("special effect", 2));
	}

	public void comedy() {
		lst.add(new Keyword("喜劇", 5));
		lst.add(new Keyword("きげき", 5));
		lst.add(new Keyword("コメディ", 5));
		lst.add(new Keyword("幽默", 5));
		lst.add(new Keyword("搞笑", 5));
		lst.add(new Keyword("有趣", 4));
		lst.add(new Keyword("黑色幽默", 2));
		lst.add(new Keyword("日常", 2));
		lst.add(new Keyword("笑", 1));
		

		lst.add(new Keyword("comedy", 5));
		lst.add(new Keyword("sitcom", 5));
		lst.add(new Keyword("romcom", 5));
		lst.add(new Keyword("funny", 3));
		lst.add(new Keyword("hilarious", 3));
		lst.add(new Keyword("humor", 3));
	}

	public void thriller() {
		lst.add(new Keyword("懸疑", 5));
		lst.add(new Keyword("サスペンス", 5));
		lst.add(new Keyword("驚悚", 5));
		lst.add(new Keyword("スリラー", 5));
		lst.add(new Keyword("恐怖", 5));
		lst.add(new Keyword("ホラー", 5));
		lst.add(new Keyword("燒腦", 4));
		lst.add(new Keyword("推理", 4));
		lst.add(new Keyword("謀殺", 4));
		lst.add(new Keyword("犯罪", 4));
		lst.add(new Keyword("殺人", 3));
		lst.add(new Keyword("靈異", 3));
		lst.add(new Keyword("駭人", 3));
		lst.add(new Keyword("鬼片", 3));
		lst.add(new Keyword("顫慄", 2));
		lst.add(new Keyword("嚇", 2));
		lst.add(new Keyword("毛骨悚然", 1));

		lst.add(new Keyword("thriller", 5));
		lst.add(new Keyword("suspense", 5));
		lst.add(new Keyword("horror", 5));
		lst.add(new Keyword("murder", 4));
		lst.add(new Keyword("detective", 4));
		lst.add(new Keyword("crime", 4));
		lst.add(new Keyword("supernatural", 3));
		lst.add(new Keyword("terrify", 3));
		lst.add(new Keyword("horrify", 3));
	}
	
	public void sports() {
		lst.add(new Keyword("運動", 5));
		lst.add(new Keyword("うんどう", 5));
		lst.add(new Keyword("競技", 5));
		lst.add(new Keyword("コンペ", 5));
		lst.add(new Keyword("熱血", 4));
		lst.add(new Keyword("少年", 4));
		lst.add(new Keyword("籃球", 3));
		lst.add(new Keyword("羽球", 3));
		lst.add(new Keyword("排球", 3));
		lst.add(new Keyword("網球", 3));
		lst.add(new Keyword("桌球", 3));
		lst.add(new Keyword("自行車", 3));
		lst.add(new Keyword("游泳", 3));
		
		lst.add(new Keyword("sports", 5));
		lst.add(new Keyword("compete", 5));
		lst.add(new Keyword("athletic", 4));
		lst.add(new Keyword("on fire", 4));
		lst.add(new Keyword("warm blood", 4));
		lst.add(new Keyword("hot-blooded", 4));
		lst.add(new Keyword("juvenile", 4));
		lst.add(new Keyword("teenager", 4));
		lst.add(new Keyword("basketball", 3));
		lst.add(new Keyword("badminton", 3));
		lst.add(new Keyword("volleyball", 3));
		lst.add(new Keyword("tennis", 3));
		lst.add(new Keyword("table tennis", 3));
		lst.add(new Keyword("bike", 3));
		lst.add(new Keyword("bicycle", 3));
		lst.add(new Keyword("swimming", 3));
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
