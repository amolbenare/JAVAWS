class Person{
	int id;
	String name;
	String gender;

	public void printProfile(){
		System.out.println("Id: "+this.id+"\nName:"+this.name);
	}
}

//Single Inheritance
class Student extends Person{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = 10;
		s1.name = "Amol";
		s1.gender = "Male";
		s1.printProfile();
	}
}

//Single Inheritance
class Employee extends Person{
	String company = "ABC";
	String city = "Pune";
	public static void main(String[] args) {
		Employee s1 = new Employee();
		s1.id = 101;
		s1.name = "Pritee";
		s1.gender = "Female";
		s1.printProfile();
	}
}


//Multilevel
class Manager extends Employee{
	public static void main(String[] args) {
		Manager s1 = new Manager();
		s1.id = 101;
		s1.name = "Pritee";
		s1.gender = "Female";
		s1.printProfile();
		System.out.println("Company: "+s1.company);
	}
}