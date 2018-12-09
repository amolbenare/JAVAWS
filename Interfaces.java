/*
Interface

	Interface is declared with 'interface' keyword.
	Interface is used to achieve full abstraction
	interface is a set of rules(abstract methods) which implementing class nees to follow

	Syntax:

	interface InterfaceName
	{
		//body
	}

	Rules:
		1. Variables are not allowed
		2. Only contstants are allowed (public static final)
		3. Cannot have constructor 
		4. An object cannot be created
		5. Only abstract methods are allowed (before jdk1.8)
		6. static and default methods(a method deinition with 'default' keyword) are allowed since jdk1.8
		7. one class can implements multiple interfaces
*/


interface Encryption{
	String name = "Topper"; //Compiler adds 'public static final' before
	void m(); // All methods are by default abstract

	//Static method allowed for jdk 1.8 and later
	static void print(){
		System.out.println("I am printing static");
	}

	//default method allowed for jdk 1.8 and later. To add new featires to an existing interfaces java has provided default methods in interfaces
	default void print2(){
		System.out.println("I am printing default");
	}
}

interface Encryption2{
	String name = "Topper2"; //Compiler adds 'public static final' before
	void m(); // All methods are by default abstract

	//default method allowed for jdk 1.8 and later. To add new featires to an existing interfaces java has provided default methods in interfaces
	default void print2(){
		System.out.println("I am printing default 2");
	}
}

class Demo implements Encryption, Encryption2{
		public void m(){

		}
		//Both interface have same default method print. So it will give error at compiletime
		//This is again a dimond problem. To avoid this you will have to compulsory implement this method in an inherited class.
		public void print2(){
			System.out.println("I am printing demo");
		}
		public static void main(String[] args) {
			new Demo().print2();
			System.out.println(Encryption2.name);// If both interfaces have same intance variable the use it by the name of an interface

		}
}













