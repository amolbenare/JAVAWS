import java.util.concurrent.*;

class Mythread implements Callable{
	public String call() throws Exception{
		//Thread.sleep(2000);
		if(Thread.currentThread().getName().equals("Thread-5")){
			Thread.sleep(2000);
		}
		return Thread.currentThread().getName()+" Hi";
	}
}

class ThreadDemo{
	public static void main(String[] args)throws Exception {
		FutureTask[] farr =  new FutureTask[10];
		for (int i =0; i<10 ; i++) {
			Mythread tt = new Mythread();
			farr[i] = new FutureTask(tt);
			new Thread(farr[i]).start();
			
		}

		for (FutureTask fut : farr) {
			if(fut.isDone())
			System.out.println(fut.get());
		}
		System.out.println("End of Main");
	}
}