import java.io.*;
class ExceptionDemo{
	public static void main(String[] args) {
		try{
			File f = new File("abc.txt");
			FileWriter fr = new FileWriter(f);
			f.write("Topper skills");
			f.flush();
			f.close();
		}catch(IOException ex){
			System.out.println(ex);
		}finally{
			System.out.println("Release all resources here");
		}
	}

}