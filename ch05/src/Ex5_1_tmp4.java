import java.util.Arrays; // ctrl + shift + o 자동으로 import문 추가

public class Ex5_1_tmp4 {

	public static void main(String[] args) {
		
//		int[] arr = {0,1,2,3,4}; //1차원 배열 arr
		int[] arr = {3,2,5,6,1};
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); //배열 arr을 오름차순으로 정렬
		System.out.println(Arrays.toString(arr));
		int[][] arr2D = {
							{11,12},
							{21,22}
						};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(str2D==str2D2);//참조변수 값 비교
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		int[] arr2 = Arrays.copyOf(arr, 7);
		int[] arr3 = Arrays.copyOfRange(arr, 1, 4);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		

		 
	}

}
 