package ex_240426;

public class CallByRefMethodTest {
	public static void increase(int m) {
		m = m +1;
	}
	public static void increaseArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}

	public static void main(String[] args) {
		int n = 10;
		increase(n);
		System.out.println("n : " + n);
		
		int [] a = {1,2,3,4,5};
		increaseArray(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] : :" + a[i]);
			
		}
		

	}

}
