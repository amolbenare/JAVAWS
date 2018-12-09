import java.io.*;

class FileDemo{
	public static void main(String[] args) throws Exception{
		File f = new File("myFile.txt");
		if(!f.exists()){
			f.createNewFile();
		}

		File dir = new File("testdir");
		if(dir.exists()){
			dir.mkdir();
		}

		File fnew = new File(dir, "MyFile.txt");
		if(!fnew.exists()){
			f.createNewFile();
		}

		// String flist[] = dir.list();

		// for (String name : flist) {
		// 	System.out.println(name);
		// }

		FileWriter fw = new FileWriter(f);
		fw.write("Topper Skills");
		//65 is ASCII value of 'A'
		fw.write(65);
		char carr[] = {'a', 'b', 'c'};
		fw.write(carr);
		fw.flush();



		// Using BufferedWriter
		File fbw = new File("myFileBuffered.txt");
		if(!fbw.exists()){
			fbw.createNewFile();
		}
		FileWriter ff = new FileWriter(fbw);
		BufferedWriter bfw = new BufferedWriter(ff);
		bfw.write("Topper Skills");
		//65 is ASCII value of 'A'
		bfw.newLine();
		bfw.write(65);
		bfw.newLine();
		char carrfbw[] = {'a', 'b', 'c'};
		bfw.write(carrfbw);
		bfw.flush();



		File fpw = new File("myFilePrintWriter.txt");
		if(!fpw.exists()){
			fpw.createNewFile();
		}
		FileWriter fpw = new FileWriter(fpw);
		PrintWriter pfw = new PrintWriter(fpw);
		pfw.println("Topper Skills");
		pfw.println(65);
		char carrpfw[] = {'a', 'b', 'c'};
		pfw.println(carrpfw);
		pfw.flush();
	}
}