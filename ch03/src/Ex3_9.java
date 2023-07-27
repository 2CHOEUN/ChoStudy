
public class Ex3_9 {

	public static void main(String[] args) {
		int a = 1_000_000;    // 1,000,000   1백만 = 10의 6제곱
		int b = 2_000_000;    // 2,000,000   2백만  = 10의 6제곱

		// 10의 12제곱. int의 범위는 10의 9제곱
		//오버플로우 발생
		//long c = a * b;       // a * b = 2,000,000,000,000 ?
		long c = (long)a * b;
	

		System.out.println(c);
	}

}
