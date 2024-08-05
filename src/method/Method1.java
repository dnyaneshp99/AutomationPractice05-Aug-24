package method;

public class Method1 {
	
	//1 - Static Regular Method From Same Class
	
	// Main method is a Pre-defined method
	public static void main (String[]args) {
		
		System.out.println("Main method start");
		D1();                                    //Method name(); (how method declare in main method)
		D2();
		System.out.println("Main method end");
		
		//diffClassName.methodname();
		Method2.S1(); //static regular method from diff class
		Method2.S2(); //static regular method from diff class
		
	}
	
	
	// Regular static Method  (User defined)
	public static void D1 () //regular method Declaration
	
	{
		
		System.out.println("D1:regular static method only runs when it is called in Main Method ");
		
	}
	
	
	// Regular static Method  (User defined)
	public static void D2() {
		
		System.out.println("D2: regular static method is a user defined method");
	}

}
