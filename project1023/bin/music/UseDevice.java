package music;

class UseDevice{
	public static void main(String[] args) {
		//AudioDevice ad = new AudioDevice();
		//추상 클래스는 불완정한 클래스이므로 인스턴스 생성불가
		//따라서 자식객체가 완성하면 가능..
		AudioDevice ad = new speaker();
		//자식 speaker 에의해 인스턴스화 될수 있다

		//riding.Wing wing = new speaker();
		//wing.fly();

		//extedns 건 implements 건 둘다 is a  이다 
		//따라서 서로간 같은 종류의 자료형으로 간주되며 형변환도 지원!
		//자식이 오버라이딩하면 자식의 메서드를 최우선 호출

		AudioDevice s = new speaker();
		s.stop();

	}
}
