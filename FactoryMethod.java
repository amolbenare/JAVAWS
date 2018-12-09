class A{
	private A(){

	}
	//private static A a = new A();
	private static A obj = null;
	public static A getInstance(){
		if(obj==null){
			obj = new A();
		}
		return obj;
	}
}

class Car
{
	public static void main(String[] args) {
		A obj = A.getInstance();
		A obj2 = A.getInstance();
		System.out.println(obj);
		System.out.println(obj2);
	}
}