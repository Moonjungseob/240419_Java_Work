package ex_240425;

public class ArrayRefMethodTest {
	//이 메서드는 크기가 3개인, 문자열 타입의 배열을 생성해주는 메서드.
	public static String[] makeStringArray() {
		String [] tempStringArray = new String[3];
		for (int i = 0; i < tempStringArray.length; i++) {
			tempStringArray[i] = "먹고 싶은 점심 메뉴" + i;
		}
		return tempStringArray;
		
		

	}


	
	
	public static void main(String[] args) {
		String[] lunchMenuMjs;
		
		lunchMenuMjs = makeStringArray();
		for (int i = 0; i < lunchMenuMjs.length; i++) {
			System.out.println("기본값 출력 : " + lunchMenuMjs[i]);
		}
		int lunchMenuMjsAddress = System.identityHashCode(lunchMenuMjs);
		System.out.println("lunchMenuMjs의 메모리 위치 주솟값 : " + lunchMenuMjsAddress);
		
		String[] lunchMenuMjs2;
		
		lunchMenuMjs2 = makeStringArray();
		for (int i = 0; i < lunchMenuMjs2.length; i++) {
			System.out.println("기본값 출력 : " + lunchMenuMjs2[i]);
		}
		int lunchMenuMjsAddress2 = System.identityHashCode(lunchMenuMjs2);
		System.out.println("lunchMenuMjs2의 메모리 위치 주솟값 : " + lunchMenuMjsAddress2);
		
		
}
}
