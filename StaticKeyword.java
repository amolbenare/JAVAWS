class Car{
	static int counter;
	Car(){
		counter++;
	}
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		Car c4 = new Car();
		Car c5 = new Car();

		System.out.println(Car.counter);

	}
}