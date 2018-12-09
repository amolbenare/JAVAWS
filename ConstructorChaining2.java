class B
{
	B(){
		System.out.println("B1");
	}
	B(int num){
		System.out.println("B2");
	}
	B( int i, String s){
		System.out.println("B3");
	}

	//IIB - Which will copy this block in all the constructors after super() and this() statement
	{
		System.out.println("IIB");
	}

	public static void main(String[] args) {

		B b = new B();
		B b1 = new B(30);
		B b2 = new B(30, "Amol");
		
	}
}
