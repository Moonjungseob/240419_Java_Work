package ex_240425;

public class Array2Dim {

	public static void main(String[] args) {
		int[][] intArray = new int[3][2];
		intArray[0][0] = 1;
		intArray[0][1] = 2;
		intArray[1][0] = 3;
		intArray[1][1] = 4;
		intArray[2][0] = 5;
		intArray[2][1] = 6;
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.print(i + "행" + j + "열" + "값 : " + intArray[i][j] + "\t" );
			}
			System.out.println();
		}

	}

}
