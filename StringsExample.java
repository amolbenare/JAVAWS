/*
String is a sequence of characters
String internally uses character array
java.Lang.String class is an abstraction over a character array which store a String
String is immutable. That means once String is created then we cannot change it.
	1. Object creation
		There are two ways of creating String class objects in java.
		a. Using new keyword
			
			String city = new String("Pune");

		b. Using string literals

			String city = "Pune";

	2. String concatenation
		a. Using concat()
		b. Using + operator

	3. String comparison
		a. == Compares object address
		b. equals() - compares content by considering the ase
		c. equalsIgnoreCase() - compares content without considering the case
		d. compareTo() - compares based on character set values
	4. String methods
	5. String tokenisation

	Q. Why is String immutable
*/

import java.util.StringTokenizer;
class StringDemo{
	public static void main(String[] args) {
		String city1 = new String("Pune");
		//city1 += "MH";

		//System.out.println(city1);

		String city2 = "Pune";
		//city2 = city2.concat(" India");

		System.out.println(city2);

		String city3 = "PUNE";	
		String city4 = "PUNE";

		//city1 == city2 will return false because address of both are not equal. 
		if(city1 == city2){
			System.out.println("city1 & city2 are same");
		}else{
			System.out.println("city1 & city2 are not same");
		}

		//city1 == city2 will return true because city1.intern() will return address of string pool which is same for String literal "Pune" for both variables. 
		if(city1.intern() == city2){
			System.out.println("city1 & city2 are same");
		}else{
			System.out.println("city1 & city2 are not same");
		}

		if(city1.equals(city2)){
			System.out.println("city1 & city2 are same");
		}else{
			System.out.println("city1 & city2 are not same");
		}

		if(city1.equalsIgnoreCase(city3)){
			System.out.println("city1 & city2 are same");
		}else{
			System.out.println("city1 & city2 are not same");
		}

		System.out.println(city1.compareTo(city2));



		//String methods

		String str = new String("Pune mumbai nashik delhi");
		String[] cities = str.split(" ");
		for (String s : cities) {
			System.out.println(s);
		}

		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}


	}
}