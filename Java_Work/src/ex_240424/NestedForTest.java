package ex_240424;

import java.util.Scanner;

public class NestedForTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1; i<10; i++) {
			for(int j = 1; j<10; j++)
			System.out.print(i + "*" + j + "=" + i*j);
			System.out.print("\t");
		}
		
		System.out.println();

	}

}
