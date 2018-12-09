//Daemon thread creation and testing

class DaemonThread extends Thread
{
  public void run()
  {
    while(true)
    {
      System.out.println("in DaemonThread");
      try{
Thread.sleep(500);
      }catch(Exception e){}
    }
  }
}

public class DaemonDemo extends Thread
{
	public void run(){  
    System.out.println("Name: "+Thread.currentThread().getName());  
  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
   System.out.println("daemon thread work");  
  }  
  else{  
  System.out.println("user thread work");  
 }  
 }  

	public static void main(String args[])
	{

		DaemonDemo t1=new DaemonDemo();
		DaemonDemo t2=new DaemonDemo();
		DaemonDemo t3=new DaemonDemo();

    DaemonThread dt =new DaemonThread();
    //dt.setDaemon(true);
    dt.start();

t1.setDaemon(true);//now t1 is daemon thread  
    
  t1.start();//starting threads  
  t2.start();  //user thread
  t3.start();  //user thread

	}
}