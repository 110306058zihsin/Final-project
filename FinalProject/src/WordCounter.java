
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

	public WordCounter(String urlStr) {
		this.urlStr = urlStr;
	}

	private String fetchContent() throws IOException {
		URL url = new URL(this.urlStr);

		URLConnection conn = url.openConnection();
		conn.setRequestProperty("User-agent", "Chrome/107.0.5304.107");//

		InputStream in = conn.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"));

		String retVal = "";

		String line = null;

		while ((line = br.readLine()) != null) {
			retVal = retVal + line + "\n";
		}

		return retVal;
	}

	public int BoyerMoore(String T, String P) {// P is key word
		int i = P.length() - 1;
		int j = P.length() - 1;
		do {
			if (T.charAt(i) == P.charAt(j)) {
				if (j == 0) {
					return i;
				} else {
					i--;
					j--;

				}
			} else {
				i = i + P.length() - min(j, 1 + last(T.charAt(i), P));
				j = P.length() - 1;
			}

		} while (i <= T.length() - 1);
		return -1;

	}

	public int min(int a, int b) {
		if (a < b)
			return a;
		else if (b < a)
			return b;
		else
			return a;
	}

	public int last(char c, String P) {
		for (int i = P.length() - 1; i >= 0; i--) {
			if (P.charAt(i) == c) {
				return i;
			}

		}
		return -1;

	}

	public int countKeyword(String keyword) throws IOException {
		if (content == null) {
			content = fetchContent();
		}
		// To do a case-insensitive search, we turn the whole content and keyword into
		// upper-case:
		content = content.toUpperCase();
		keyword = keyword.toUpperCase();
//
//		
		int retVal = 0;
		int i = content.length();
		int j = keyword.length();
		int n = BoyerMoore(content, keyword);
		while (n != -1) {
			content = content.substring(n + j, i);
			i = content.length();
			n = BoyerMoore(content, keyword);
			retVal++;
		}
		return retVal;
	}

//	public int countKeyword(String keyword) throws IOException {
//		if (content == null) {
//			content = fetchContent();
//		}
//		content = content.toUpperCase();
//		keyword = keyword.toUpperCase();
//		
//		if (!(content.contains("動漫"))) {
//			return 0;
//		} else {
//
//
//			int retVal = 0;
//			int fromIdx = 0;
//			int found = -1;
//
//			while ((found = content.indexOf(keyword, fromIdx)) != -1) {
//				retVal++;
//				fromIdx = found + keyword.length();
//			}
//
//			return retVal;
//		}
//	}
}
