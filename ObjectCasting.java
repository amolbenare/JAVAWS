/*
Object Casting

Types
	1. Upcasting / implicit casting
	2. Down casting / explicit casting
*/

class Parent{
	int a = 100;
	void m2(){
		System.out.println("This is parent");
	}

	void print(){
		System.out.println("This is print parent");
		System.out.println("In parent this"+this.toString());

	}

}

class Child extends Parent{
	int b;

	void m3(){
		System.out.println("This is Child");
	}

	void print(){
		System.out.println("This is Print child"+ this.toString());
		System.out.println("in child Super" + super.toString());
		System.out.println("in child Super" + this.a);

		super.print();
	}
}

class Test{
	public static void main(String[] args) {
		
		Parent p = new Parent();

		//Child cc = (Child)p; // down casting/ explicit - Not allowed

		Child c = new Child();

		Parent pp = c; //implicit / upcasting

		Parent p2 = new Child(); // Upcasting



		// Dynamic / Runtime polymorphism

		Parent p = new Child();
		p.m2();
		//p.m3(); // Not allowed
		p.print()




		//This and Super
		Child c = new Child();
		System.out.println(c.toString());
		c.print();

	}
}

