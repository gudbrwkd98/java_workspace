class Plane{
	String name="º¸À×747";
	static int price=9000;
	String color="white";
	int p; 
	
	public void setPrice(){
		price=10;
	}
	public static void main(String[] args){
		int a;
		Plane p1 = new Plane();
		Plane p2 = new Plane();

		p1.price=3000;
		System.out.println(p2.price);
		price=5000;
		System.out.println(Plane.price);

		System.out.println(p1.p);
	}
}
