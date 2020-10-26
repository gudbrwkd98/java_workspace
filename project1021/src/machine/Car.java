class Car{
	String name = "Benz";
	String color = "red";
	int price = 500;
	Wheel wheel=null ; // 이코드가 낮설짖 않은이유??
	//클래스는 안에서 자료형을 들수 있는데, 자바의 자료형은 총 4개이다.
	// 따라서 이 클래스 안에는 문자,숫자,논리값 이외에도 객체형도 올수있다..
	// 객체 자료형도 자료형이니깐..

	//클래스명과 동일한 이름의 메서드를 가리켜 생성자라 하고,
	//생성자는 이름에서도 알수 있듯이 객체의 생성타임에 무언가 초기화 작업이 있을떄,
	//작업을 수행하는 용도의 메서드이다...
	public Car(){
	//this.wheel
		wheel = new Wheel();
	}

	public static void main (String [] args){
		//자동차를 생성하고,
		//이 자동차 이름 출력하고,
		//이 자동차 바퀴의 브랜드,색상,가격을 출력까지 하시오

		Car c = new Car();
		System.out.println(c.name);
		System.out.println(c.color);
		System.out.println(c.price);
		System.out.println(c.wheel.brand);
		System.out.println(c.wheel.color);
		System.out.println(c.wheel.price);
	}
}
