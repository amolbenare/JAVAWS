class Brain{
	String status = "Working";
}

class Animal
{
	public static void main(String[] args) {
		Brain b = new Brain(); //Brain is Part of Animal. And Animal is the owner because Animal has created an object of Brain class
		System.out.println(b.status);
	}
}

