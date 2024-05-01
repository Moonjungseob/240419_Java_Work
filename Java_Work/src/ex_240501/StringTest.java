package ex_240501;

public class StringTest {

	public static void main(String[] args) {
		String java = "java";
		String bus = "bus";
		String butter = "butter";
		String energy = "energy";
		
		int javaCompareBus = java.compareTo(bus);
		System.out.println("javaCompareBus : " + javaCompareBus);
		
		int busCompareJava = bus.compareTo(java);
		System.out.println("busCompareJava : " + busCompareJava);
		
		int busCompareBus = bus.compareTo(bus);
		System.out.println("busCompareBus : " + busCompareBus);
		
		int energyCompareBus = energy.compareTo(bus);
		System.out.println("energyCompareBus : " + energyCompareBus);
		
		int butterCompareBus = butter.compareTo(bus);
		System.out.println("butterCompareBus : " + butterCompareBus);
		
		int resultBusAddr = System.identityHashCode(bus);
		System.out.println("resultBusAddr : " + resultBusAddr);
		
		int resultjavaAddr = System.identityHashCode(java);
		System.out.println("resultjavaAddr : " + resultjavaAddr);
		
		String busConcatJava = bus.concat(java);
		
		int resultBusjavaAddr = System.identityHashCode(busConcatJava);
		System.out.println("resultBusjavaAddr : " + resultBusjavaAddr);
		
		StringBuffer stringBufferJava = new StringBuffer("java");
		System.out.println("stringBufferJava : " + stringBufferJava);
		
		int resultStringBuffer = System.identityHashCode(stringBufferJava);
		System.out.println("resultStringBuffer : " + resultStringBuffer);
		
		stringBufferJava.append("bus");
		System.out.println("stringBufferJava : " + stringBufferJava);
		
		int resultStringBuffer2 = System.identityHashCode(stringBufferJava);
		System.out.println("resultStringBuffer2 : " + resultStringBuffer2);
		
	}
	
		

}
