package method;

public class Method3 {
	
	
	//3: non-static regular method from same class
	public static void main(String[] args) {
		
		//1: create object of current/same class
		//2: method call --->objectName.methodNmae();
		
		
		//object creation
		//1: className objectName=new className();      // syntax
		//2: objectName.methodName();                   //method call syntax
		Method3 dnyanesh=new Method3();
		
		dnyanesh.s1();
		dnyanesh.s2();
		dnyanesh.s2();       // method reuse
		
		//1: Method3  --> className  -> Datatype /object type
		//2: dnyanesh --> objectName -> use to identify/refer object
		//3: new      --> keyword    -> use to create blank/empty object
		//4: Method3  --> className  -> constructor -> use to copy/load all the members of the class into object
		
	}

	//non static regular method
	public void s1() {
		
		System.out.println("running non-static regular method from same class--s1");
		
	}
	
	public void s2() {
		
		
		System.out.println("running non-static regular method from same class--s2");
	}
	
	
}
