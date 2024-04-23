package ex_240423;

public class Leagueoflegends {
	private static final String faker ="그저 대상혁!";
	private String sportsName;
	private String sportsMember;
	public String getSportsName() {
		return sportsName;
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	public String getSportsMember() {
		return sportsMember;
	}
	public void setSportsMember(String sportsMember) {
		this.sportsMember = sportsMember;
	}
	public String getSportsSeason() {
		return sportsSeason;
	}
	public void setSportsSeason(String sportsSeason) {
		this.sportsSeason = sportsSeason;
	}
	private String sportsSeason;
	

	public void jungling() {
		System.out.println("블루 -> 작골 -> 레드 3렙 갱킹 루트");
	}
	public void linefight() {
		System.out.println("미니언 막타 먹으면서 적 스킬 피하고 내 스킬 맞추기");
	}
	public void destroynexes() {
		System.out.println("한타 승리 후 적 넥서스 파괴");
	}
	public static String showStatcMember() {
		return faker;
	}
	@Override
	public String toString() {
		return "Leagueoflegends [sportsName=" + sportsName + ", sportsMember=" + sportsMember + ", sportsSeason="
				+ sportsSeason + "]";
	}
	

}
