package util.dto;

public class Person {
		private String name;
		private String number;
		private String Registrationdate;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public String getRegistrationdate() {
			return Registrationdate;
		}
		public void setRegistrationdate(String registrationdate) {
			Registrationdate = registrationdate;
		}
		public Person(String name, String number, String registrationdate) {
			super();
			this.name = name;
			this.number = number;
			Registrationdate = registrationdate;
		}
		@Override
		public String toString() {
			return "[ 이름 :" + name + ", 연락처" + number + ", 등록시간" + Registrationdate + "]";
		}
		
}