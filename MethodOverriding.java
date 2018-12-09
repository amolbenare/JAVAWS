/*
Method Overriding

Rules: 
	1. Must be in IS A relationship (sub & super class)
	2. Methods must have same name
	3. Parameters must be same
	4. retun type must be same in case of premitive datatypes
	5. Body usually changes
	6. access modifiers can be in broader scope or less restrictive
	7. If overriden method does not throws exception the overriding method cannot thows checked exception but it can throw unchecked exception 
*/class Person{
	int id;
	String name;
	String gender;

	void printProfile(){
		System.out.println("Id: "+this.id +"\nName: "+this.name+ "\nGender: "+this.gender);
	}
}

class Employee extends Person{
	String company;
	String city;

	void printProfile(){
		System.out.println("Id: "+this.id +"\nName: "+this.name+ "\nGender: "+this.gender+"\nCompany: "+this.company+"\nCity:"+this.city);
	}


	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 10;
		e1.name = "abc";
		e1.gender = "Male";
		e1.company = "ABC";
		e1.city = "Pune";
		e1.printProfile();

		Person p = new Employee();
		p.id = 10;
		p.name = "abc";
		p.gender = "Male";
		//p.company = "ABC";
		//p.city = "Pune";
		p.printProfile();
	}

}