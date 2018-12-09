/*
Nested classes

a class defined within another class is called Nested class

	Nested classes
	1. Static classes

	2. Non static(Inner classes)

		a. Member inner class
		b. Method / local inner class
		c. Anonymous inner class
*/


class Outer{
	private String name = "Topper";
	private static String namestatic = "Topper";
	//Member inner class
	private class Inner{
		void display(){
			System.out.println(name);
		}

	}

	static class InnerStatic{
		void display(){
			System.out.println(namestatic);
		}

	}

	//To execute this use command java Outer$InnerStaticWithMain
	static class InnerStaticWithMain{
		void display(){
			System.out.println(namestatic);
		}

		public static void main(String[] args) {
			System.out.println("In static inner main");
		}

	}

	public static void main(String[] args) {
		Outer out = new Outer();
		Inner in = out.new Inner();
		in.display();

		InnerStatic stat = new InnerStatic();
		stat.display();


	}
}



//

class OuterLocalInner{
	OuterLocalInner(){
		class Inner{
			void display(){
				System.out.println("Outer constructor inner");
			}
		}

		Inner in = new Inner();
		in.display();
	}

	{
		class Inner{
			void display(){
				System.out.println("Outer IIB inner");
			}
		}
		Inner in = new Inner();
		in.display();
	}

	void m1(){
		class Inner{
			void display(){
				System.out.println("Outer m1 inner");
			}
		}
		Inner in = new Inner();
		in.display();
	}

	public static void main(String[] args) {
		OuterLocalInner outer = new OuterLocalInner();
		outer.m1();
	}
}




