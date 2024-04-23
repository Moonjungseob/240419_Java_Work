package ex_240423_2;

public class P5_pdf {
	int i1 = 10;
	static int i2 = 20;
	public static void showNumber() {
		int i1 = 100;
		
		System.out.println("result : " + i1);
	}

	public static void main(String[] args) {
		int i1 = 20;
		System.out.println("i1 : " + i1);
		
		showNumber();
		
		P5_pdf p5 = new P5_pdf();
		int result = p5.i1;
		System.out.println("result i1 : " + result);
		int result2 = p5.i2;
		int result3 = P5_pdf.i2;
		System.out.println("result2 i1 : " + result2);
		System.out.println("result3 i1 : " + result3);


	}

}
