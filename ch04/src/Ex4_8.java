class Ex4_8 {
	public static void main(String args[]) {
		/*
		for (int i = 1; i <= 3; i++) { // 괄호{}안의 문장을 3번 반복
			System.out.println("Hello");
		}
		
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		for (int i = 1, j = 10; i <= 10; i++, j--) {
			System.out.println("i="+i + ",j="+j);
		}
		*/
		int i;//scope(범위) - 선언위치부터 선언된 블럭의 끝까지
		
		
		//조건식을 생략하면, true로 간주되어서 무한반복문이 됨.
		for(i = 1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println(i);

	}
}