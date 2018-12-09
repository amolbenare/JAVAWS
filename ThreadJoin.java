class JoinDemo extends Thread{
	public void run(){
		for (int i=1; i<=4 ; i++) {
			System.out.println(i + " "+Thread.currentThread().getName());
			try{
				Thread.sleep(1000);
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		JoinDemo m1 = new JoinDemo();
		JoinDemo m2 = new JoinDemo();
		JoinDemo m3 = new JoinDemo();
		m1.start();
		m1.join();
		m2.start();
		m3.start();
	}
}