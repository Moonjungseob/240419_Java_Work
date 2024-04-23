package ex_240423;

public class Zerg {
	//ZERG 클래스에서 모두 사용가능함 
	public static final String COMMONTE_STRING = "스타1에서 저그가 짱이다. 개인적인 의견.";
	
	private String drone;
	private String zergling;
	private String hydra;
	public String getDrone() {
		return drone;
	}
	public void setDrone(String drone) {
		this.drone = drone;
	}
	public String getZergling() {
		return zergling;
	}
	public void setZergling(String zergling) {
		this.zergling = zergling;
	}
	public String getHydra() {
		return hydra;
	}
	public void setHydra(String hydra) {
		this.hydra = hydra;
	}
	
	
	public void makeMoney() {
		System.out.println("드론으로 미네랄, 가스 같이 채위하기.");
	}
	public void patrolDrone() {
		System.out.println("드론으로 스타팅 포인트로 정찰 보내기 매우중요.!!!");
	}
	public void slectStrategy(String strategy) {
		System.out.println("내가 선택한 전략 : " + strategy);
	}
	
	//매개변수 3개짜리 생성자
	public Zerg(String drone, String zergling, String hydra) {
		super();
		this.drone = drone;
		this.zergling = zergling;
		this.hydra = hydra;
	}
	//매개변수 없는 생성자, = 디폴트 생성자라고 함.
	//별로 말이 없으면, 시스템이 알아서 만들어 줌.
	//하지만, 내가 따로 매개변수가 있는 생성자를 만들면, 기본 생성자를 안 만들어줌.
	public Zerg() {
		// TODO Auto-generated constructor stub
	}
	//toString , 해당 객체에 있는 내용을 한방에 출력해주는 메서드 만들기.
	@Override
	public String toString() {
		return "Zerg [drone=" + drone + ", zergling=" + zergling + ", hydra=" + hydra + "]";
	}
	
	
	
	
}
