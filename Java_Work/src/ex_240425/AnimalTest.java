package ex_240425;

public class AnimalTest {

	public static void main(String[] args) {
		// 고양이 만들기
		Cat cat1 = new Cat();
		cat1.setName("모찌");
		cat1.setAge(2);
		String[] catFoodList = {"츄르", "참치캔", "생선"};
		cat1.setFavoriteFood(catFoodList);
		cat1.setPlace("우리집");
		cat1.toString();
		String catInformation = cat1.toString();
		System.out.println("고양이 정보 : " + catInformation);
		cat1.moveAction("우다닥 다닌다.");
		cat1.speakSound("야용~~");
		System.out.println("고양이가 사는 곳 : " + cat1.getPlace());
		
		Dog dog1 = new Dog();
		dog1.setAge(1);
		dog1.setName("레오");
		String[] dogFoodList = {"배추", "닭가슴살", "뼈다귀"};
		dog1.setFavoriteFood(dogFoodList);
		dog1.setPlace("우리집 앞마당");
		dog1.setFavoriteplay("공 던지기 놀이");
		dog1.setHate("목욕");
		dog1.toString();
		String dogInformation = dog1.toString();
		System.out.println("개 정보 : " + dogInformation);
		dog1.moveAction("천천히 4발로 걸어다닌다");
		dog1.speakSound("왈왈");
		System.out.println("개가 사는 곳 : " + dog1.getPlace());
		System.out.println("개가 좋아하는 것 : " + dog1.getFavoriteplay());
		System.out.println("개가 싫어하는 것 : " + dog1.getHate());
		dog1.canDoit("빵 하면 죽은척하기");
		dog1.sleepTime("수면시간 : 10시간");
		
		Animal ani1 = new Cat();
		Animal ani2 = new Dog();
		String [] catFoodLiString = {"참치캔", "사료"};
		
		Cat cat2 = new Cat("야옹이", 3, catFoodLiString, "상용집");
		cat2.showInfo();
		
		Animal[] animals = new Animal[17];
		
		

	}

}
