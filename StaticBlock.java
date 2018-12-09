class A{
	static{
		System.out.println("A static");
	}
	A(){
		System.out.println("A()");
	}
	{
		System.out.println("A IIB");
	}
}


class Car extends A{
	static{
		System.out.println("Static");
	}
	Car(){
		System.out.println("Car()");
	}
	{
		System.out.println("Car IIB");
	}
	public static void main(String[] args) {
		new Car();
		System.out.println("Main");
	}
}