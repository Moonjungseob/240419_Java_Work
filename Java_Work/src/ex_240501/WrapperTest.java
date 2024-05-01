package ex_240501;

public class WrapperTest {

	public static void main(String[] args) {
		Integer integer = Integer.valueOf(31);
		int bitCountResult = integer.bitCount(31);
		System.out.println("bitCountResult : " +bitCountResult);
		
		int refTointResult = integer.intValue();
		System.out.println("refTointResult : " +refTointResult);
		
		int stringTointResult = integer.parseInt("1234");
		System.out.println("stringTointResult : " +stringTointResult);
		
		int intToBinaryResult = integer.parseInt("31", 16);
		System.out.println("intToBinaryResult : " +intToBinaryResult);
	}

}
