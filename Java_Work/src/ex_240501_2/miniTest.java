package ex_240501_2;

import java.util.Scanner;
import java.util.Vector;


import util.CollectionUtils;

class Person {
    private String menu;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return  menu;
    }
}

public class miniTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Person> vectorPerson = new Vector<Person>();
		System.out.println("먹고 싶은 메뉴 입력하기 프로젝트");
		System.out.println("==================================");
		while (true) {
			System.out.println("1. 메뉴 입력, 2.메뉴 출력, 3. 검색하기, 4. 종료하기");
			int todayFood = scanner.nextInt();
			if (todayFood == 1) {
				System.out.println("메뉴를 입력해 주세요");
				String wantFood = scanner.next();
				Person person = new Person();
				person.setMenu(wantFood);
				vectorPerson.add(person);
				System.out.println(wantFood+"가 입력되었습니다.");
				System.out.println("메뉴로 돌아갑니다.");
				System.out.println();
			} else if (todayFood == 2) {
				System.out.println("입력한 메뉴를 출력합니다.");
				CollectionUtils.showVectorElem(vectorPerson);
				System.out.println();
				System.out.println("메뉴로 돌아갑니다.");
				System.out.println();
			} else if (todayFood == 3) {
			    System.out.println("입력한 메뉴를 검색합니다");
			    String findFood = scanner.next();
			    boolean found = false;
			    for (Person person : vectorPerson) {
			        if (person.getMenu().equals(findFood)) {
			            found = true;
			            System.out.println("검색한 메뉴는 : " + findFood + "입니다.");
			            break;
			        }
			    
			    if (!found) {
			        System.out.println("입력한 메뉴가 없습니다.");
			    }
			}
				System.out.println("메뉴로 돌아갑니다.");
				System.out.println();
									

			} else if (todayFood == 4) {
				System.out.println("검색을 종료합니다. 좋은 하루 되세요.");
				break;
				
		}
			else {
				System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요");
		}
		

}
}
}
