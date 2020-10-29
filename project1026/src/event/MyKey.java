package event;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

//키보드와 관련한 이벤트가 발생하면 자바 가상머신이 keyListener 에게 keyevent 
//인스턴스를 전달하게된다
//이 전달된 인스턴스는 ketylistener 가 보유한 추상메서들에 전달되어지므로
//개발자는 추상메서드는 재정의 하면서 원하는 로직을 작성하면됨!!


public class MyKey implements KeyListener{
	//오버 라이딩하고 키보드 누를때마다 눌렀어 ? 메세지 나오게 처리	

	public void keyPressed(KeyEvent event){
		System.out.println("눌름 press");
	}

	public void keyTyped(KeyEvent event){
		System.out.println("눌름 typed");
	}

	public void keyReleased(KeyEvent event){
		System.out.println("눌름 released");
	}

}
