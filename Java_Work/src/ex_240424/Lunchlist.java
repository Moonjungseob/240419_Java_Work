package ex_240424;

import java.util.Scanner;

public class Lunchlist {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String [] Lunchlist  = new String[5];
		System.out.println("먹고싶은 음식 5개 입력 해주세요.");
		for (int i = 0; i < Lunchlist.length; i++) {
			Lunchlist[i] = scanner.next();

	}
		System.out.println("오늘 먹고 싶은 점심 메뉴 리스트 :");
		for (int i = 0; i < Lunchlist.length; i++) {
			System.out.print(Lunchlist[i]+ " " );

		}

}
}