package ex_240426;

public class BookTest {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		Book book1 = new Book("해리포터", "J K 롤링", "150000");
		books[0] = book1;
		Book book2 = new Book("반지의 제왕","J R R 톰킨",  "170000");
		books[1] = book2;
		Book book3 = new Book("트와일라잇", "스테프니 메이어", "54000");	
		books[2] = book3;
		
			System.out.println("책의 정보를 출력합니다.");
		for (int i = 0; i < books.length; i++) {
			System.out.println("책이름 정보입니다." + books[i].getBookName());
			System.out.println("책저자 정보입니다." + books[i].getBookAuthor());
			System.out.println("책가격 정보입니다." + books[i].getBookPrice());
			
		}
		
		}
	}


