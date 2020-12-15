package eg1;

import eg2.AnotherPack;

public class HelloMethod {
	public static void main(String[] args) {
		iAmStatic();
		iAmStatic("angel");
		// classname.methodname() to access static methods of different class
		Another.iAmStaticAnother();
		Another.iAmStaticAnother("surya");
		AnotherPack.iAmStaticAnotherPack();
		AnotherPack.iAmStaticAnotherPack("Eliz");
		
		// classname objname = new(dynamic memory location) Constructor = instantiation or object creation
		
		HelloMethod h = new HelloMethod();
		h.iAmNonStatic(); // calling the method with the help of an object
		h.iAmNonStaticAgain();
		
		AnotherPack a = new AnotherPack();
		a.iAmNonStaticAnotherPack();
	}
	public static void iAmStatic() {
		System.out.println("Hello static");
	}
	public static void iAmStatic(String name) {
		System.out.println("Hello static by name and name = "+name);
		}
	// non static method
	public void iAmNonStatic() {
		System.out.println("non static method of HelloMethod class");
	}
	public void iAmNonStaticAgain() {
		System.out.println("non static method of HelloMethod class");
	}
}
