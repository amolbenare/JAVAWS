/*
	start() method registers the task with thread schedular.
*/

class MyThread extends Thread{
	public void run(){
		for(int i = 0; i <10 ; i++){
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}catch(Exception ex){

			}
		}
	}
}

class MyThreadSeconWay implements Runnable{
	public void run(){
		for(int i = 0; i <10 ; i++){
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}catch(Exception ex){

			}
		}
	}
}

class ThreadDemo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();


		//Second way of creating thread
		Thread t2 = new Thread(new MyThreadSeconWay());
		t2.start();
	}
}