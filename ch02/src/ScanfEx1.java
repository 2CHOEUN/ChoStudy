import java.util.Scanner; // import문 추가

public class ScanfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // JVM에 관리되어 자동적으로 관리되어 닫아줌.
		
		/*
		int num = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println(num);
		System.out.println(num2);
		*/
		
		String input = scanner.nextLine(); // 행단위로 받을때
		int num = Integer.parseInt(input);
		
		System.out.println(num);
	}

}
