class Encryption
{
	static String encryptPassword(String pass){
		return pass + " ABC";
	}
}

class Car {
	
	static void print(String msg){
		System.out.println(msg);
	}

	public static void main(String[] args) {
		Car.print("Amol");
		String encrPass = Encryption.encryptPassword("Amol");
		System.out.println(encrPass);
	}
}