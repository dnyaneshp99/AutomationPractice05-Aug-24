package method;

public class Method1_1 {
	
	//1 - Static Regular Method From Same Class
	public static void main (String[]args) {
		
		f1();              //Method name ();---> how to declare
		f2();
		f3();
		f2();             //reuse 
		
	}
	
	public static void f1() {
		
		System.out.println("Static Regular Method From Same Class 1");
		
	}
	
	public static void f2() {
		
		System.out.println("Static Regular Method From Same Class 2");
		
	}

	public static void f3() {
		
		System.out.println("Static Regular Method From Same Class 3");
		
	}
}
