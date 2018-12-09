
/*
Rules:
	1. Method must be within Same class
	2. Method must have Same Name
	3. Paramether must be diffrent (type or number of parameters)
	4. Return type can be same or diffrent
	5. Body usually remains same
	6. Access modifiers can be any
*/

class OverLoading{
	private void print(int num){
		System.out.println("Number is "+num);
	}
	String print(String msg){
		System.out.println("Message is "+msg);
		return "Message is: "+msg;
	}
	public void print(double d){
		System.out.println("Double Number is "+d);
	}
	public static void main(String[] args) {
		OverLoading o = new OverLoading();
		o.print(10);
		o.print("Hello world!");
		o.print(12.33);
	}
}