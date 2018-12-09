
interface Printable{
	void printing(String s);
}
class Outer{
	public static void main(String[] args) {
		
		//Anonymous class
		Printable p = new Printable(){
			public void printing(String s){
				System.out.println(s);
			}
		};

		p.printing("TopperClass");
	}

}