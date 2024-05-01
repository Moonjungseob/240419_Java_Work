package ex_240426;

class Sample {
	public int a;

	private int b = 100;
	int c;

	public int getB() {
		return b;
	}

//전역만 확인
	static int tvChannel = 3;

	public static void channelUP() {
		tvChannel++;
	}
	public static void channelDown() {
		tvChannel--;
	}
}

public class AccessTest {

	public static void main(String[] args) {
		Sample sample = new Sample();
//		sample.b = 3;
		int result = sample.getB();
		System.out.println("B의 값 : " + result);

		sample.a = 200;
		System.out.println("sample.a의 값 :" + sample.a);

		// 이상용씨, 강루키, 홍사자, 프로젝트 인해서 합숙중, 공용 거실에 쉬는 중.
		Sample lsy = new Sample();
		Sample krk = new Sample();
		Sample hsj = new Sample();
		System.out.println("이상용씨가 티비를 " + lsy.tvChannel + "번 채널 시청 ");
		System.out.println("강루키 씨가 UFC 를 보고 싶어서 채널 1 올렸음.");
		//강루키 씨가 채널을 변경
		Sample.channelUP();
		System.out.println("이상용씨와, 강루키, 홍사자는 같이 채널" + lsy.tvChannel + "번 채널 시청 ");

	}

}
