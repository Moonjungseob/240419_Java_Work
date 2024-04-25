package ex_240425;

public class Cat extends Animal{
	private String place;

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Cat() {
		super();
		
	}

	public Cat(String name, int age, String[] favoriteFood, String place) {
		super(name, age, favoriteFood);
		this.place = place;
	}
	public void showInfo() {
		System.out.println("이름 : " + this.getName());
		System.out.println("나이 : " + this.getAge());
		for(String likeFood: this.getFavoriteFood()) {
			System.out.println("좋아하는 음식 : " + likeFood);
		}
//		System.out.println("좋아하는 음식 : " + this.getFavoriteFood());
		System.out.println("사는 곳 : " + this.getPlace());
	}

}
