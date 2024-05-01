package ex_240430;

class A {
	public A() {
		System.out.println("생성자 A() 호출");
	}
}

class B extends A {
	public B() {
		System.out.println("생성자 B()호출");
	}
}

class C extends B {
	public C() {
		System.out.println("생성자 C()호출");
	}
}

public class SuperConsTest {
	

	public static void main(String[] args) {
		C c = new C();

	}

}
