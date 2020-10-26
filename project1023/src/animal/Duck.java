package animal;
public class Duck extends Bird{
	/*Duck is a Bird
	  Duck 형은 Bird 형이다
	  오리는 새다
	*/

	String name = "난 오리";
		public void quack(){
			System.out.println("꽥꽥");
		}

	public static void main(String [] args){
		Duck d1 = new Duck();
		Duck d2 = new Duck();

		Bird b = new Bird();

		//Bird b = new Duck(); // 새 는 오리 
		Duck a = new Duck();
		Bird r = new Bird();
		r = a ;
		a = (Duck)r; //자료형 클래스는 자료형 Duck 는 Duck Bird 는 Bird 
		// 작 <---- 큰 데이터변수변환은 downcasting
		// 큰 (---- 작 upcasting  

		//결론 : 객체 자료형도 자료형이므로 기본자료형의 원칙이 상당부분 그대로 적용되고있다

	}
}
