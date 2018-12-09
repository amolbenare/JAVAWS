/*
Super and this refer to current running object. You can check in this program address of c , super and this is same.
super refers to the parent part of the object 
this refers to the child part of the object.

	---------------
        m1()
		m2()
		city				super
		name
	---------------
		m1()
		m2()				this
		city()		
	---------------

*/

class Parent{
	String city = "Pune";
	String name  = "Topper Skills";
	void m1()
	{
		System.out.println("Parent m1()");
	}
	void m3()
	{
		System.out.println("Parent m3()");
		System.out.println("this: "+this.toString());
	}
}

class Child extends Parent{
	String city = "Mumbai";

	void m1(){
		System.out.println("Child m1");
	}

	void m2(){
		System.out.println("Child m2()");
		System.out.println("Super: "+super.toString());
		this.m3();
		super.m1();
	}

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("c:"+c);
		c.m2();
		
		
	}
}