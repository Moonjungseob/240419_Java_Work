package ex_240424;

import java.util.Scanner;

public class TodayLunch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("오늘 점심 메뉴 무엇을 먹을까요 프로젝트");

//		int todayLunch = scanner.nextInt();

//		if (todayLunch == 1)
//			System.out.println("오늘은 비가 오는군요 삼선우동을 추천합니다.");
//
//		else if (todayLunch == 2)
//			System.out.println("오늘은 흐린날이네요 밀면을 추천합니다.");
//
//		else if (todayLunch == 3)
//			System.out.println("오늘은 맑은날이네요 된장찌개 어떠세요?");
//
//		else if (todayLunch == 4)
//			System.out.println("오늘은 바람이 많이 부는군요 돼지국밥을 추천합니다.");
//
//		else if (todayLunch == 5)
//			System.out.println("날씨를 모르신다면 그저 치멘.");

//		switch (todayLunch) {
//			case 1: System.out.println("오늘은 비가 오는군요 삼선우동을 추천합니다.");
//		break;
//			case 2: System.out.println("오늘은 흐린날이네요 밀면을 추천합니다.");
//			break;
//			case 3: System.out.println("오늘은 맑은날이네요 된장찌개 어떠세요?");
//			break;
//			case 4: System.out.println("오늘은 바람이 많이 부는군요 돼지국밥을 추천합니다.");
//			break;
//			default: System.out.println("날씨를 모르신다면 그저 치멘.");
//			break;
		while (true) {
			System.out.println("오늘 날씨가 어떤가요?");
			System.out.println("1. 비 2. 흐림 3. 맑음 4. 바람 5. 종료");
			int todayLunch = scanner.nextInt();
			if (todayLunch == 1)
				System.out.println("오늘은 비가 오는군요 삼선우동을 추천합니다.");
			else if (todayLunch == 2)
				System.out.println("오늘은 흐린날이네요 밀면을 추천합니다.");

			else if (todayLunch == 3)
				System.out.println("오늘은 맑은날이네요 된장찌개 어떠세요?");

			else if (todayLunch == 4)
				System.out.println("오늘은 바람이 많이 부는군요 돼지국밥을 추천합니다.");
			else if (todayLunch == 5)
				break;
		}
		System.out.println("좋은 하루 되세요.");

		scanner.close();

	}

}
