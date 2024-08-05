package method;

public class Method1_2 {
	
	//1 - Static Regular Method From Same Class
	public static void main(String[] args) {
		
		f3();
		f4();
		d1();
		e1();
		f3();              // method reuse
		
		
	}
	public static void f3() {
		System.out.println("Advantage of Method--> 1) Code Reusability 2) Code Optimization ");
	}
	
	public static void f4() {
		System.out.println("Static Regular Method From Same Class 2");
	}

	public static void d1() {
		System.out.println("Static Regular Method From Same Class 3");
		
	}
	
	public static void e1() {
		System.out.println("Static Regular Method From Same Class 4");
	}
}
