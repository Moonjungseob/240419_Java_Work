package ex_240424;

import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
		//스캐너 사용하기
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가입할 이메일을 작성해주세요 : ");
		String userEmail = scanner.next();
		System.out.println("가입할 메일은: " + userEmail);
		
		
		
		scanner.close();

	}

}
