package event;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

public class MyWindowListener implements WindowListener{
	public void windowActivated(WindowEvent e){
		System.out.println("windowActivated 호출");
	}
	public void windowClosed(WindowEvent e){
		System.out.println("windowClosed 호출");
	}
	public void windowClosing(WindowEvent e){
		System.out.println("windowClosing 호출");
	}
	public void windowDeactivated(WindowEvent e){
		System.out.println("windowDeactivated 호출");
	}
	public void windowDeiconified(WindowEvent e){
		System.out.println("windowDeiconified 호출");
	}
	public void windowIconified(WindowEvent e){
		System.out.println("windowIconified 호출");
	}
	public void windowOpened(WindowEvent e){
		System.out.println("windowOpened 호출");
	}
}
