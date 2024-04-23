package ex_240423;

public class TodaylunchMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 시작");
		KoreanFood bibimbab = new KoreanFood("비빔밥", 9000, "본죽비빔밥");
		System.out.println(" 오늘 점심 메뉴 : " + bibimbab.getFoodName());
		System.out.println(" 오늘 점심 메뉴 가격 : " + bibimbab.getFoodPrice() + "원");
		System.out.println("오늘 점심 메뉴 먹는 장소 : " + bibimbab.getFoodPlace());
		String test = KoreanFood.showStatcMember();
		System.out.println("test 변수에 담긴 내용 출력 " + test);
		
		int result = Hello.sum(1000, 2000);
		System.out.println("Hello의 클래스안에 함수 실행 결과 result : " + result);

	}

}
