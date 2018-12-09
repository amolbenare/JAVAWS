//server
import java.io.*;
import java.net.*;

class Server
{

public static void main(String[] args) {
	ServerSocket ss=null;
	Socket client=null;
	

	try{
ss=new ServerSocket(8888);
System.out.println("Server is running...");

client= ss.accept();

System.out.println("A client connected...");


 BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
 
 PrintWriter writer = new PrintWriter(client.getOutputStream(), true);

 BufferedReader kbdreader =new BufferedReader(new InputStreamReader(System.in));
 



String line = reader.readLine();
System.out.println("A client says: "+line);

while(true)
{


line = kbdreader.readLine();
writer.println(line);
writer.flush();


line = reader.readLine();
System.out.println("A client says: "+line);

if (line.trim().equals("bye")) {
		System.out.println("Connection closing...");
		if(!client.isClosed())client.close();
		System.exit(0);
	}
}


}catch(Exception e)
	{
		System.out.println("Could not connect to client");
	}
}
}

/*
import java.io.*;
import java.net.*;

class Server
{

public static void main(String[] args) {
	ServerSocket ss=null;
	Socket client=null;
	
	

	try{
ss=new ServerSocket(9999);
System.out.println("Server is running...");

client= ss.accept();

System.out.println("A client connected...");

 
      BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
      BufferedReader kbdreader =new BufferedReader(new InputStreamReader(System.in));
      PrintWriter writer = new PrintWriter(client.getOutputStream(), true);
      writer.println("[type 'bye' to disconnect]");
System.out.println("A client is connected..");
String line = reader.readLine();
        System.out.println("A client says: "+line);
      while (true) {
        
        if (line.trim().equals("bye")) {
          writer.println("bye!");
          break;
        }
 
        System.out.println("[echo] " + line);
        writer.println("[echo] " + kbdreader.readLine());
        writer.flush();
      
       }
}catch(Exception e)
	{
		System.out.println("Could not connect to client");
	}

}

}
*/