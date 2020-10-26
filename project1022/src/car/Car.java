package car;

public class Car{
	String brand;
	
	public Car(String brand){
		this.brand = brand;
		System.out.println("자식의 super()로 호출됩니다");
	}

	public Car(){	//매개변수 갯수가 다르므로 오버로딩됨
					
	}
	public void Move(){
		System.out.println("차가 갑니다");
	}
}
