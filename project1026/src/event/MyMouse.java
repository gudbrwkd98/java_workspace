package event;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
public class MyMouse implements MouseListener {
public void mouseClicked(MouseEvent e) {
	System.out.println("누름");
}
    				
public void mouseEntered(MouseEvent e) {
	System.out.println("누름1");
}
    	
public void mouseExited(MouseEvent e)  {
	System.out.println("누름2");
}
    			
public void mousePressed(MouseEvent e) {
	System.out.println("누름3");
}
  
public void mouseReleased(MouseEvent e){
	System.out.println("누름4");
}

}
