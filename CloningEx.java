

class AddressShallow{
	String street;
	String city;
}

class AddressDeep implements Cloneable{ 
	String street;
	String city;
	public AddressDeep clone() throws CloneNotSupportedException{
		return (AddressDeep)super.clone();
	}
}

class Student implements Cloneable{
	int rollNo;
	String name;
	AddressShallow addrShallow;
	AddressDeep addrDeep;

	Student(int rollno, String name, AddressShallow addrshallow, AddressDeep addrdeep){
		this.rollNo = rollno;
		this.name = name;
		this.addrShallow = addrshallow;
		this.addrDeep = addrdeep;
	}

	public Student clone() throws CloneNotSupportedException{
		Student s = (Student)super.clone();
		s.addrDeep = s.addrDeep.clone();
		return s; 
	}

	public String toString(){
		return "RollNo: "+this.rollNo +"  Name: " + this.name +"  City Shallow: "+ this.addrShallow.city + "  Street Shallow: "+ this.addrShallow.street +"  City Deep: "+ this.addrDeep.city + "  Street Deep: "+ this.addrDeep.street ;
	}
}

class CloneDemo{
	public static void main(String[] args) {
		AddressShallow addshallow = new AddressShallow();
		addshallow.street = "Narhe";
		addshallow.city = "Pune";

		AddressDeep addsdeep = new AddressDeep();
		addsdeep.street = "Narhe";
		addsdeep.city = "Pune";

		Student s1 = new Student(1,"abc",addshallow, addsdeep);

		try{
			Student s2 = s1.clone();
			s2.name = "Topper";
			s2.addrShallow.city = "Mumbai";
			s2.addrDeep.city = "Mumbai";

			System.out.println(s1);
			System.out.println(s2);


		}catch(Exception ex){

		}
	}
}