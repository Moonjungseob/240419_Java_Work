package ex_240502;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import util.LocalDateTimeMake;
import util.dto.Person;

public class Hashminitest {

	// 함수로 분리하기.
	public static void recommendFood(Scanner scanner, HashMap<String, Person> hashmap) {

		while (true) {
			System.out.println("=================================");
			System.out.println("연락처 입력 프로젝트 허쉬맵 버전");
			System.out.println("1. 연락처 입력, 2. 연락처 출력, 3. 연락처 검색하기 , 4. 연락처 삭제하기 5. 랜덤 연락처 출력 6. 종료하기. ");
			System.out.println("=================================");

			String weather = scanner.next();
			

			if (weather.equals("6")) {
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				break;
			} else if (weather.equals("1")) {
				System.out.println("이름 입력>>");
				String userName = scanner.next();

				System.out.println("연락처 입력>>");

				String number = scanner.next();
				String nowTime = LocalDateTimeMake.now();
				System.out.println("등록시간은 : " + nowTime + "입니다.");

				Person person = new Person(userName, number, nowTime);
				hashmap.put(userName, person);

				continue;
			} else if (weather.equals("2")) {
				System.out.println("연락처 모두 출력>>");
				System.out.println("모든 연락처 출력");
				Set<String> keys = hashmap.keySet(); // 모든 키를 Set 컬렉션에 받아옴
				Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴

				while (it.hasNext()) {
					String key = it.next(); // 키
					System.out.println(hashmap.get(key));
					continue;
				}
			} else if (weather.equals("3")) {
            	
                System.out.println("연락처 검색>>");
            	String eng = scanner.next();
             	// 해시맵에서 '키' eng의 '값' kor 검색
    			Person kor = hashmap.get(eng);
    			if(kor == null) 
    			System.out.println(eng + 
    			"는 없는 단어 입니다.");
    			else 
    			System.out.println(kor);
    			continue;
            
                       	
		
              
            } else if (weather.equals("4")) {
				System.out.println("이름으로 삭제하기 예)이상용>>");
				
				String deleteName = scanner.next();
				
	             	// 해시맵에서 '키' eng의 '값' kor 검색
	    			Person kor = hashmap.get(deleteName);
	    			if(kor == null) 
	    			System.out.println(deleteName + "는 없는 단어 입니다.");
	    			else 
	    			System.out.println(deleteName + "의 모든 연락처가 삭제되었습니다.");
	    			hashmap.remove(deleteName);
	    			continue;
		
			
            } else if (weather.equals("5")) {
                System.out.println("랜덤 연락처 출력>>");
                if (hashmap.isEmpty()) {
                    System.out.println("등록된 연락처가 없습니다.");
                } else {
                    // 해시맵에서 랜덤한 하나의 키를 선택
                    int randomIndex = (int) (Math.random() * hashmap.size());
                    Set<String> keys = hashmap.keySet();
                    Iterator<String> iterator = keys.iterator();
                    String randomKey = null;
                    for (int i = 0; i <= randomIndex; i++) {
                        randomKey = iterator.next();
                    }
                    // 선택된 키에 해당하는 연락처 출력
                    System.out.println(hashmap.get(randomKey));
                }
            }
			
		
		}}
        
    

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		HashMap<String, Person> haStrings = new HashMap<String, Person>();

		recommendFood(scanner, haStrings);
	}
}