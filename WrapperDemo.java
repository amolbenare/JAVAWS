class WrapperDemo{
	public static void main(String[] args) {
		int a = 10;
		int i = 20;

		//premitive to object  - Boxing
		Integer intval = new Integer(a);
		System.out.println(intval);

		//object to premitive  - UnBoxing
		int b = intval.intValue();
		System.out.println("int b="+b);

		//String to Object
		Integer intObj = Integer.valueOf("20");

		//Object to string
		String intstr = intval.toString();
		System.out.println("String instr" +intstr);

		//Primitive to string

		String s = Integer.toString(i);
		String s1 = String.valueOf(i);
		String s3 = intval.toString();
		System.out.println("String s="+s+" String s1"+s1+" String s3"+s3);

		//String to premitive
		int ii = Integer.parseInt("10");
		System.out.println("int ii="+ii);
	}
}