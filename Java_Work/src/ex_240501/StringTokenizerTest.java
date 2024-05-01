package ex_240501;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String query = "메뉴=초밥&가격=10000&장소=문범초밥";
		StringTokenizer st = new StringTokenizer(query, "&");
		int n = st.countTokens(); // 분리된 토큰 개수
		System.out.println("토큰 개수 = " + n);
		while(st.hasMoreTokens()) { 
		String token = st.nextToken(); // 토큰 얻기
		System.out.println(token); // 토큰 출력
		}


	}

}
