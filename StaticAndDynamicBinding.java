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
	}
}

class Child extends Parent{
	String city = "Mumbai";

	void m1(){
		System.out.println("Child m1");
	}

	void m2(){
		System.out.println("Child m2()");
	}

	public static void main(String[] args) {
		/*Parent p = new Parent();
		p.m1();
		p.m3();
		//p.m2() // Not allowed*/
		

		/*Child c = new Child();
		c.m1();
		c.m3();
		c.m2();
		System.out.println(c.city);*/


		Parent c = new Child();
		c.m1();
		c.m3();
		//c.m2(); //Not allowed
		System.out.println(c.city);
		System.out.println(c.name);
		
		
	}
}