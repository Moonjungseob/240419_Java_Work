package ex_240426_4;

public class Person {
	private String name;
	private String age;
	private String[] hobbies;
	
	
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	
	public void speak() {
		System.out.println("Hello~~");
	}
	
	public void eat () {
		System.out.println("냠냠~");
	}
	
	public void walk() {
		System.out.println("걷기~~");
	}
	
	public void sleep() {
		System.out.println("잠자기~~");
	}

}
