
/*
	String 						StringBuffer 							StringBuilder

1.  Immutable					Mutable									Mutable

2.  Synchrinized				Synchrinized 							non Synchrinized

3.  better for storing			better for modification					better for modification and high
    and retrieving 				and therad safety						performance because it is non
    string values														synchronized

*/


class StringDemo{
	public static void main(String[] args) {
		StringBuffer sbuffer = new StringBuffer("Topper skills"); //Thread safe
		sbuffer.append(" Pune");

		StringBuffer sbuilder = new StringBuffer("Topper skills"); //No Thread safe
		sbuilder.append(" Pune");


	}
}