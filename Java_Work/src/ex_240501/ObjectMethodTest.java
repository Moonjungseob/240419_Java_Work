package ex_240501;

class Person{
	private String name, email;
	
	public Person(String name, String email) {
		// 생성자, 매개변수2개
	super();
	this.name = name;
	this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}
	
	public boolean equals(Person person) { 
		if(person.getName() == this.name && person.getEmail() == this.email) {
			return true;
		} else {
			return false;
		}
	}
	
	// 방법1, Object 를 똑같은 파라미터 타입으로 재정의.
//	@Override
//	//equals 를 재정의해서, name과 , email 2개 같다면, true, 아니면 false 반환하기. 
//	public boolean equals(Object obj ) { // 부모와 같은 이름의 메서드를 재정의.
//		if(obj instanceof Person) {
//		Person person = (Person)obj;}
//	
	
	
	
}

public class ObjectMethodTest {

	public static void main(String[] args) {
		Person p1 =  new Person("이상용","lsy@naver.com");
		Person p2 =  new Person("이상용","lsy@naver.com");
		String result = p1.toString();
//		System.out.println("Object의 toString 이용해서 출력한 결과 : " + result);
		System.out.println("Person 의 toString 이용해서 출력한 결과 : " + result);
		
		boolean p1_p2_eqauls_result = p1.equals(p2);
//		System.out.println("Object의 equeals 이용해서 p1.equals(p2 출력한 결과 : " + p1_p2_eqauls_result);
		System.out.println("Person의 equeals 이용해서 p1.equals(p2 출력한 결과 : " + p1_p2_eqauls_result);
	}

}
