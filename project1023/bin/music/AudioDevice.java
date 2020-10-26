package music;
abstract public class AudioDevice{
	abstract public void setVolume(); //추상 메서드라 한다
	abstract public void playMP3(); // 또다른 기능 무조건 추가 
	void stop(){
		System.out.print("멈춤");
	}
}
