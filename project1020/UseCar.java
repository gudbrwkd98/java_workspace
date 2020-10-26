class UseCar{
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.color);
		System.out.println(c.price);
		System.out.println(c.auto);
		c.run();
		c.stop();
	}
}
