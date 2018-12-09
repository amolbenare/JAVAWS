//client

import java.io.*;
import java.net.*;

class Client
{

public static void main(String[] args) {
	Socket client=null;

	try{

client=new Socket("127.0.0.1",8888);
//192.168.0.4

 BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));

  PrintWriter writer = new PrintWriter(client.getOutputStream(), true);

BufferedReader kbdreader =new BufferedReader(new InputStreamReader(System.in));


String line = kbdreader.readLine();
writer.println(line);
writer.flush();

while(line.trim() !="bye")
{
line = reader.readLine();
System.out.println("A Server says: "+line);

line = kbdreader.readLine();
writer.println(line);
writer.flush();


}

}catch(Exception e)
{
	e.printStackTrace();
}
}}



/*
import java.io.*;
import java.net.*;

class Client
{

public static void main(String[] args) {
	Socket socket=null;
	BufferedReader reader=null;
	DataOutputStream out=null;
	try{

socket=new Socket("127.0.0.1",9999);

reader= new BufferedReader(new InputStreamReader(socket.getInputStream()));
out= new DataOutputStream(socket.getOutputStream());

BufferedReader kbdreader =new BufferedReader(new InputStreamReader(System.in));



String s=null;


while(true)
{
s=kbdreader.readLine();
if (s.trim().equals("exit")) {
	out.writeUTF("Client exited");
break;	

}
	out.writeUTF(s);
	out.flush();
	
        System.out.println("[server] " + reader.readLine());
        
}

}catch(Exception e)
	{
		System.out.println("Could not start the server");
		e.printStackTrace();
	}
}

}

*/