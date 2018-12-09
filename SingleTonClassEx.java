/*
 	Rules -
 		1. Make a class final class so that it cannot be overriden.
 		2. Make constructor private so that no one can create object with new keyword.
 		3. Make a static method to return the object
*/

final class Singleton{
	private static Singleton sobj = new Singleton();
	private Singleton(){

	}
	public static Singleton newInstance(){
		return sobj;
	}

}

class SingleTonDemo{
	public static void main(String[] args) {
		Singleton s1 = Singleton.newInstance();
		Singleton s2 = Singleton.newInstance();
		Singleton s3 = Singleton.newInstance();
		Singleton s4 = Singleton.newInstance();
		System.out.println(s1); //
		System.out.println(s2); // Printed address shows all the references pointing to single object
		System.out.println(s3); //
		System.out.println(s4); // 
	}
}