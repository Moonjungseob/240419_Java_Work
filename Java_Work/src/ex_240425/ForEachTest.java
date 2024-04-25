package ex_240425;

public class ForEachTest {

	public static void main(String[] args) {
		String [] foodMenu = {"우동", "라면", "칼국수", "라멘"}; 
		for (String menu : foodMenu) {
			System.out.println("foodMenu : " + menu);
		}
	}

}
