package use;
import animal.Dog;
		//Dog 이라는 클래스의 패키지 선언부를 그래도 적으면됩니다
class UseDog{
	public static void main(String[] args) {
		//현재클래스와 다른경로에 있는 클래스를 사용해야하는데,
		//컴파일러가 어떻게 Dog.class 를 찾을수있는지 알아야 합니다.
		//현재로선는 컴파일러가 UseDog 과 같은 디렉토리만 찾아 헤맵니다.
		//따라서 아해의 코드는 cant find sysbol 에러 날겁니다
		//Dog d = new Dog(); // 시도해보세요

		//이 문제를 해결하려면 여러분들은 클래스의 경로를 알려줘야합니다
		//일반적으로 경로를 등록할떄는 환경변수를 이용합니다
		//경로가 일반 파일일 경우 path 환경변수이지만 
		//경로가 클래스 파일일 경우는 classpath 환경변수를 이용하면되빈다
		//이떄 classpath 환경변수에 어느 경로를 등록해야할지 고민해보세요 
		//외우지 마시고, 간단히 생각해보세여 현재 UseDog 클래스와 Dog
		
		Dog d = new Dog();
		d.run();
	}
}
