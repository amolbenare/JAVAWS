//Abstract class - A class declared with abstract keyword is called abstract class
//Abstract class is used to achieve partial abstraction

/*
Rules: 
	1. Abstract keyword at class definition is mandetory
	2. All type of data members are allowed
	3. Constrtuctor is available
	4. All types of methods are allowed (an abstract methods must be declared with abstract keyword)
	5. cannot create an object
	6. There can be an abstract class without having any abstract method.
	7. If we write an abstract method in a class then that class must be abstract.

Quest. If We cannot create an object of an abstract class then why is there constructorin abstract class?

*/

abstract class Encryption{
	String name = "Topper";
	static String KEY = "abc";
	static final double PI = 3.14;
	String encrypt(String text){
		return text="abc";
	}

	Encryption(){

	}

	abstract String encryptPassword(String psd);
	static void m2(){
		System.out.println("m2()");
	}
}

class AbstractDemo extends Encryption{

	String encryptPassword(String psd){
		return psd+" mnb";
	}
	public static void main(String[] args) {
		Encryption.m2()
		
	}
}