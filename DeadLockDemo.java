public class DeadLockDemo extends Thread
{
	public static Object l1=new Object();
	public static Object l2=new Object();
	
	public static void main(String[] args) throws InterruptedException 
	{
		Thread t1 =new Thread( new Runnable() 
		{
		
			public void run() 		
			{
				synchronized(l1)
				{
					try 
					{
						System.out.println("Thread 1 holding l1 "); 
						sleep(1000);
						System.out.println("Thread 1 waiting for l2 ");
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
					synchronized(l2)
					{
					System.out.println("Thread 1 is holding l1 & l2 ");
					}
				}
			}
		});
		t1.start();
		Thread t2 =new Thread( new Runnable() 
		{
		
			public void run() 		
			{

			synchronized(l2)
				{
					try 
					{
						System.out.println("Thread 2 holding l2 "); 
						sleep(1000);
						System.out.println("Thread 2 waiting for l1 ");
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
				
					synchronized(l1)
					{
						System.out.println("Thread 2 is holding l1 & l2 ");
								
					}
				}
			}
		});
		t2.start();
	}
}
