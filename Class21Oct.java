class Student{
	int rollNo;
	String name;

	Student(){
		System.out.println("In no Args constructor");
	}

	Student(int rollno, String nameval){
		this.rollNo = rollno;
		this.name = nameval;
		System.out.println("In Parameterized constructor");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student(123, "Amol");
		s1.name = "First";
		s2.name = "Second";

		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s3.name);
	}
}