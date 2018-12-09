class DisplayMsg{
	synchronized void display(){
		for(int i=1; i<10; i++){
		System.out.println(Thread.currentThread().getName() +"   "+ i);
		}
	}

	 void displayBlock(){
	 	synchronized(this){
	 		for(int i=1; i<10; i++){
			System.out.println(Thread.currentThread().getName() +"   "+ i);
			}
	 	}
		
	}

	static void displayStatic(){
	 	synchronized(DisplayMsg.class){
	 		for(int i=1; i<10; i++){
			System.out.println(Thread.currentThread().getName() +"   "+ i);
			}
	 	}
		
	}
}

class MyThread1 implements Runnable{
	DisplayMsg dm;
	MyThread1(DisplayMsg dmval){
		dm = dmval;
	}
	public void run(){
		dm.display();
	}
}

class MyThread2 implements Runnable{
	DisplayMsg dm;
	MyThread2(DisplayMsg dmval){
		dm = dmval;
	}
	public void run(){
		dm.display();
	}
}

class ThreadDemo{
	public static void main(String[] args) {

		DisplayMsg dm = new DisplayMsg();

		Thread t1 = new Thread(new MyThread1(dm));
		t1.start();

		Thread t2 = new Thread(new MyThread1(dm));
		t2.start();
	}
}