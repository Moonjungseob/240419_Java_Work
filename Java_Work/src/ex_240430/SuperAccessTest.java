package ex_240430;

class Parent{
	public String parentName;
	
	public void makeNoodle() {
		System.out.println("부모님 국수 메뉴 레시피로 국수 만들기");
	}
}

class Child extends Parent{
	public String childName;
	
	public void makeNoodle() {
		System.out.println("이상용 국수 메뉴 레시피로 국수 만들기");
		super.parentName = "부모님 국수 이름 테스트";
	}
}



public class SuperAccessTest {

	public static void main(String[] args) {
		Parent p1 = new Child();
	//	p1.parentName;
		
		Child c1 = (Child)p1;
	//	c1.childName;
		
		c1.makeNoodle();
		
		System.out.println("c1.parentName : " + c1.parentName);

	}

}
