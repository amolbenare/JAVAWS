import java.util.*;

class A
{
	final void print(String msg){
		System.out.println(msg);
	}
}

class FinalVariable extends A{
	final int rollNo;
	FinalVariable(){
		this.rollNo = 1;
	}
	FinalVariable(int rollNo){
		this.rollNo = rollNo;
	}
	void print(String msg){
		System.out.println(msg);
	}
	public static void main(String[] args) {
		FinalVariable fv = new FinalVariable(10);
		System.out.println(fv.rollNo);
		//fv.rollNo = 20;  Can't Assign value to final variable
		System.out.println(fv.rollNo);



	}
}