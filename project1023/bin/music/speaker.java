package music;
import riding.Wing;
public class speaker extends AudioDevice implements Wing{
	boolean ooper;
	String color = "red";

	public void sound(){
		//pm의 부탁을 실수로까먹음
	}

	public void setVolume(){
		System.out.println("볼륨조절");
	}

	public void playMP3(){
		System.out.println("MP3`");
	}

	public void fly(){
		System.out.println("하늘을 날아요");
	}

	public void fly2(){
		System.out.println("하늘을 날아요2");
	}
}
