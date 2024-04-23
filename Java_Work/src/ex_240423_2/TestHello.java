package ex_240423_2;

import ex_240423.Hello;
import ex_240423.KoreanFood;
import ex_240423.Zerg;

public class TestHello {

	public static void main(String[] args) {
		// TODO 패키지 명 : ex_240423
		// 클래스 명 : Hello
		// 사용할 메서드 : sum , 리턴이 있고, 파라미터도 있다.
		// 사용해보기.
		// 다른 패키지의 클래스 사용하려면 : import
		int result;
		result = Hello.sum(10, 20);
		System.out.println("result : " + result);

		KoreanFood forksoup = new KoreanFood("섞어국밥", 9500, "밀양돼지국밥서면점");
		forksoup.showInfo();

		Zerg zerg1 = new Zerg();
		zerg1.setDrone("드론 9마리");
		zerg1.setZergling("6저글링");
		zerg1.slectStrategy("3해처리 뮤탈 기본 운영");
		zerg1.setHydra("히드라 4마리, 레이스, 커세어 방어용으로 뽑기");
		System.out.println("zerg1 객체를 바로 출력" + zerg1);

		// 생성자 3개짜리 방법
		Zerg zerg2 = new Zerg("드론 9마리", "저글링 4마리", "히드라 12마리");
		System.out.println("zerg2 객체를 바로 출력" + zerg2);

		// 전역 상수 이용
		String resultString1 = zerg1.COMMONTE_STRING;
		String resultString2 = zerg2.COMMONTE_STRING;
		// 결과 확인
		System.out.println("resultString1 : " + resultString1);
		System.out.println("resultString2 : " + resultString2);

	}

}
