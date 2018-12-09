import test.PackagesAndJar;
import static java.Lang.System.*; //Static import

class Demo{
	public static void main(String[] args) {
		PackagesAndJar temp = new PackagesAndJar();
		temp.print("Topper Skills....");

		out.println("In Demo class"); //Due to static import no need to ass System at the start. All static members of System class are available here.
	}
}