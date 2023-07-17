
public class VarEx3 {

	public static void main(String[] args) {
		final int score = 100;
//		score = 200;
		
		boolean power = false;
		
//		byte b = 128; //-128 ~ 127
		
		int oct = 010; // 8진수, 10진수로 8
		int hex = 0x10; // 16진수, 10진수로 16
		
		System.out.println("oct = " + oct);
		System.out.println("hex = " + hex);//println은 10진수로만 출력됨 8진수로 나타내고 싶다면 printf
//		System.out.printf(format, args));
		
//		long l = 10_000_000_000; 에러남
		long l = 10_000_000_000L;
		
		float f = 3.14f;// f를 제거하면 에러
		double d = 3.14;
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		
	}

}
