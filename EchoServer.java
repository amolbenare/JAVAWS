import java.io.*;
import java.net.*;
import java.lang.Thread;

public class EchoServer {
  public static void main (String[] args) {
    try {
//192.168.0.4
      ServerSocket server = new ServerSocket(9999);
      while (true) {
        Socket client = server.accept();
        EchoHandler handler = new EchoHandler(client);
        handler.start();
      }
    }
    catch (Exception e) {
      System.err.println("Exception caught:" + e);
    }
  }
}

class EchoHandler extends Thread {
  Socket client;
  EchoHandler (Socket client) {
    this.client = client;
  }

  public void run () {
    try {
      
      BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
      BufferedReader kbdreader =new BufferedReader(new InputStreamReader(System.in));
      PrintWriter writer = new PrintWriter(client.getOutputStream(), true);

      writer.println("[type 'bye' to disconnect]");
System.out.println("A client is connected..");

      String line = reader.readLine();
        System.out.println("A client says: "+line);

      while (true) {
      writer.println("[echo] " + kbdreader.readLine());
        writer.flush();

       line = reader.readLine();
System.out.println("A client says: "+line);

        
        if (line.trim().equals("bye")) {
    System.out.println("Connection closing...");
    if(!client.isClosed())client.close();
    System.exit(0);

  }

      }
    }
    catch (Exception e) {
      System.err.println("Exception caught: client disconnected.");
    }
    finally {
      try { client.close(); }
      catch (Exception e ){ e.printStackTrace(); }
    }
  }
}