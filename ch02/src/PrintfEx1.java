
public class PrintfEx1 {

	public static void main(String[] args) {
		/*
		System.out.println(10 / 3); // 정수 / 정수 = 정수
		System.out.println(10.0 / 3);
		
		System.out.printf("%d%n", 15); // 10진수 decimal
		System.out.printf("%#o%n", 15); // 8진수 octal
		System.out.printf("%#x%n", 15); // 16진수 hexa
		System.out.printf("%s%n", Integer.toBinaryString(15)); // 16진수 hexa
		
		float f = 123.456789f;
		System.out.printf("%f%n", f); //float는 정밀도가 7자리이므로 7자리만 정확함.
		
		double d = 123.456789;
		System.out.printf("%f%n", d); //double은 정밀도가 15자리.
		System.out.printf("%e%n", d);
		*/
		
		System.out.printf("[%5d]%n", 10); //남은 자리는 공백으로
		System.out.printf("[%-5d]%n", 10); //왼쪽 정렬로
		System.out.printf("[%05d]%n", 10); //공백대신 0으로
		System.out.printf("[%5d]%n", 1234567); //지정된 자리수와 상관없이 전체 출력
		
		double d = 1.23456789;
		System.out.printf("%f%n", d);
		System.out.printf("%14.10f%n", d); //소수점 앞자리는 공백,소수점은 0으로 채워짐
		System.out.printf("%14.6f%n", d); //소수점 앞자리는 공백,소수점은 0으로 채워짐
		System.out.printf("%.6f%n", d);
		
		System.out.printf("[%s]%n","www.codechobo.com");
		System.out.printf("[%20s]%n","www.codechobo.com"); // 앞에 공백으로 채워짐
		System.out.printf("[%-20s]%n","www.codechobo.com"); // 왼쪽정렬
		System.out.printf("[%.10s]%n","www.codechobo.com"); // 일부만 자르기
		
	}

}
