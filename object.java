//java.Lang.Object class - It is a base class for all classes in th java.
// It provides implementation of common operations which are required to performed on objects. 
// It has 11 methods

// boolean equals(Object obj) - Compares the content of 2 objects
// String toString() - returns the string representaion of an object
// getClass() - Get the name of a class
// clone - To create clone of an object
// hashCode() - 
// hascode contract - if equal return true then the hash code of 2 objects always same but that doesnt mean that 2 objects with same hascode are always equal
// finalisze() - To release all the resources before garbase collector remove the object
// wait() // Interprocess commmunication. wait till we get notify() call
// wait(long tmeout) // Wait for certain time period
// wait(long timeout, int nanos) // 
// notify() // to Notify single thread
// notifyAll() // To notify all threads

class A{

}
class Student{
	int rollNo;
	String name;

	public String toString(){
		return "Roll: "+this.rollNo +"\n";
	}
}
Class Test{
	public static void main(String[] args) {
		String name1 = "ABC";
		String name2 = "ABC";
		if(name1.equals(name2)){
			System.out.println("Same");
		}

		Integer num = new Integer(100);
		System.out.println(num.toString());

		Student s1 = new Student();

	}

}