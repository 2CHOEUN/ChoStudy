
public class Ex3_11 {

	public static void main(String[] args) {
		double pi = 3.141592; 
		
		System.out.println("pi = " + pi);
		System.out.println("pi*1000 = " + pi*1000);
		System.out.println("Math.round(pi*1000) = " + Math.round(pi*1000));
		System.out.println("Math.round(pi*1000)/1000 = " + Math.round(pi*1000)/1000);
		System.out.println("Math.round(pi*1000)/1000.0 = " + Math.round(pi*1000)/1000.0);
		
		/*3.141을 얻으려면?*/
		System.out.println("3.141을 얻으려면?");
		System.out.println("(int)(pi*1000) = " + (int)(pi*1000));
		System.out.println("(int)(pi*1000)/1000.0 = " + (int)(pi*1000)/1000.0);
		
		
		//double shortPi = Math.round(pi * 1000) / 1000.0;
		//System.out.println(shortPi);
	}

}
