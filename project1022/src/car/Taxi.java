package car;
public class Taxi extends Car{
	//부모의 매개변수 있는 생성자를 직접 호출해주기위해 생성자를 정의

	public Taxi(){
		super("아");
	}

	public void pass(){
		System.out.println("승객을 테웁니다");
	}
}
