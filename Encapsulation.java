class Student{
	private int rollNo;
	private String name;

	public void setRollNo(int rollNo){
		this.rollNo = rollNo;
	}
	public int getRollNo(){
		return rollNo;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}


}

class EncapDemo{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setRollNo(123);
		s1.setName("abd");

		Student s2 = new Student();
		s2.setRollNo(124);
		s2.setName("pqr");

		Demo.printProfile(s1);
		Demo.printProfile(s2);
	}
}

class Demo{
		public static void printProfile(Student s){
			System.out.println("Roll Number: "+s.getRollNo());
			System.out.println("Name: "+s.getName());
		}
	}