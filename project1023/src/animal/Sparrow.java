package animal;

public class Sparrow extends Bird{
	String name = "참새";

	public void jjack(){
		System.out.println("짹쨱");
	}

	//자식이 부모와 100% 동일한 메서드를 정의하는 기법을 오버라이딩이라한다
	public void fly(){
		System.out.println("난다");
	}

	public static void main(String [] args){
		Sparrow sp = new Sparrow();
		sp.fly(); //참새 난다 

		Bird b = new Bird();
		b.fly(); //부모새가 난다

		Bird a = new Sparrow(); 
		a.fly(); //참새가 난다
	}
}
