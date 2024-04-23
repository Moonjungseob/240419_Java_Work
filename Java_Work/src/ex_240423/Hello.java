package ex_240423;

import java.security.PublicKey;

public class Hello {
	public static int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		int i = 20;
		//자기 자신이니까 Hello.sum으로 안하고 그냥 sum만 함
		int result = sum(100, 200);
		System.out.println("result의 값 출력해보기 : " + result);

	}

}
