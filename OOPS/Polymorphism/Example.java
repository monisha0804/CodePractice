public class Example {
		
	public static int add(int a, int b) {
		int c= a+b;		
		return c;
	}
	
	public static void add(int a , int b, int c) {
		int d= a+b+c;		
		System.out.println(d);
	}
	
	public static void main(String[] args){  
		
		
		System.out.println(add(9,9));
		add(5,6,2);	
		
	}

}
