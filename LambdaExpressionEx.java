interface Encryption{
	String encrypt(String str);
}

//One way to use above functional interface is using class and implemnts the interface.
class EncryptionImpl implements Encryption{
	public String encrypt(String str){
		return str+ " hi";
	}
}

class LambdaDemo{

	void print(Encryption en){
		String ss = en.encrypt("Topper");
		System.out.println(ss);
	}

	public static void main(String[] args) {
		LambdaDemo d = new LambdaDemo();
		//Lambda Expression - Rules: If there is only single parameter then () bracket is optional.
		Encryption e1 = str -> str+" lambda";

		//Lambda exoression with full syntax
		Encryption e2 = (str) -> {return str+ " lambda2";};
		d.print(e1);
		d.print(e2);

		//Another way of doing this is using anonymous class

		d.print(new Encryption(){
			public String encrypt(String str){
				return str+ " Via Anonymous class";
			}
		});
	}
}