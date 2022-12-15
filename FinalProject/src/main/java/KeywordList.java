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
		lst.add(new Keyword("動畫", 5));
		lst.add(new Keyword("番", 5));
		lst.add(new Keyword("漫畫", 4));
		lst.add(new Keyword("劇場版", 4));
		lst.add(new Keyword("新番", 4));
		lst.add(new Keyword("輕改", 3));
		lst.add(new Keyword("聲優", 3));
		lst.add(new Keyword("巴哈姆特", 3));
		lst.add(new Keyword("票房", 3));
		lst.add(new Keyword("動畫瘋", 3));
		lst.add(new Keyword("漫改", 2));
		lst.add(new Keyword("木棉花", 2));
		lst.add(new Keyword("東立", 2));
		lst.add(new Keyword("劇情", 1));
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
		lst.add(new Keyword("校園", 5));
		lst.add(new Keyword("青春", 5));
		lst.add(new Keyword("社團", 4));
		lst.add(new Keyword("高中生", 4));
		lst.add(new Keyword("大學生", 4));
		lst.add(new Keyword("戀愛", 3));
		lst.add(new Keyword("喜歡", 3));
		lst.add(new Keyword("戀人", 3));
		lst.add(new Keyword("情", 2));
		lst.add(new Keyword("吻", 2));
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
	}

	public void action() {
		lst.add(new Keyword("動作", 15));
		lst.add(new Keyword("冒險", 15));
		lst.add(new Keyword("戰爭", 1));
		lst.add(new Keyword("戰鬥", 1));
		lst.add(new Keyword("諜", 1));
		lst.add(new Keyword("武", 1));
		lst.add(new Keyword("特效", 1));
		lst.add(new Keyword("特技", 1));
		lst.add(new Keyword("賽車", 1));
		lst.add(new Keyword("飛車", 1));
	}

	public void comedy() {
		lst.add(new Keyword("喜劇", 5));
		lst.add(new Keyword("幽默", 5));
		lst.add(new Keyword("搞笑", 5));
		lst.add(new Keyword("有趣", 4));
		lst.add(new Keyword("黑色幽默", 2));
		lst.add(new Keyword("日常", 2));
		lst.add(new Keyword("笑", 1));
		

		lst.add(new Keyword("comedy", 15));
		lst.add(new Keyword("funny", 1));
		lst.add(new Keyword("hilarious", 1));
		lst.add(new Keyword("humor", 1));
	}

	public void thriller() {
		lst.add(new Keyword("懸疑", 15));
		lst.add(new Keyword("驚悚", 15));
		lst.add(new Keyword("恐怖", 15));
		lst.add(new Keyword("燒腦", 1));
		lst.add(new Keyword("推理", 1));
		lst.add(new Keyword("謀殺", 1));
		lst.add(new Keyword("犯罪", 1));
		lst.add(new Keyword("殺人", 1));
		lst.add(new Keyword("靈異", 1));
		lst.add(new Keyword("駭人", 1));
		lst.add(new Keyword("鬼片", 1));
		lst.add(new Keyword("顫慄", 1));
		lst.add(new Keyword("嚇", 1));
		lst.add(new Keyword("毛骨悚然", 1));

		lst.add(new Keyword("thriller", 15));
		lst.add(new Keyword("suspense", 15));
		lst.add(new Keyword("horror", 15));
		lst.add(new Keyword("murder", 1));
		lst.add(new Keyword("detective", 1));
		lst.add(new Keyword("crime", 1));
		lst.add(new Keyword("supernatural", 1));
		lst.add(new Keyword("terrify", 1));
		lst.add(new Keyword("horrify", 1));
	}
	
	public void sports() {
		lst.add(new Keyword("運動", 5));
		lst.add(new Keyword("競技", 5));
		lst.add(new Keyword("熱血", 4));
		lst.add(new Keyword("青春", 1));
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
