package ex_240423;



public class Sports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leagueoflegends LG = new Leagueoflegends();
		LG.setSportsName("리그오브레전드");
		LG.setSportsMember("탑, 정글, 미드 ,원딜, 서폿");
		LG.setSportsSeason("LCK, MSI, 롤드컵");
		LG.jungling();
		LG.linefight();
		LG.destroynexes();
		System.out.println("롤은 팀게임이다.");
		String test = Leagueoflegends.showStatcMember();
		System.out.println("다들 외쳐! " + test);
		System.out.println(LG);
		
		


	}

}
