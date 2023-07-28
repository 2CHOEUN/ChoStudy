import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex5_1_tmp {

	public static void main(String[] args) {
		/*
		int[] arr = new int[10]; //길이가 5인 int배열 arr을 생성
		System.out.println("arr.length="+arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
		*/
		String[] strArr= {"가위","바위","보"};
		System.out.println(Arrays.toString(strArr));
		
		for(int i=0;i<10;i++) {
			int tmp = (int)(Math.random()*3);
			
			System.out.println(strArr[tmp]);
		}
	}

}
 