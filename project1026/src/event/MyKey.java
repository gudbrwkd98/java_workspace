package event;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

//Ű����� ������ �̺�Ʈ�� �߻��ϸ� �ڹ� ����ӽ��� keyListener ���� keyevent 
//�ν��Ͻ��� �����ϰԵȴ�
//�� ���޵� �ν��Ͻ��� ketylistener �� ������ �߻�޼��鿡 ���޵Ǿ����Ƿ�
//�����ڴ� �߻�޼���� ������ �ϸ鼭 ���ϴ� ������ �ۼ��ϸ��!!


public class MyKey implements KeyListener{
	//���� ���̵��ϰ� Ű���� ���������� ������ ? �޼��� ������ ó��	

	public void keyPressed(KeyEvent event){
		System.out.println("���� press");
	}

	public void keyTyped(KeyEvent event){
		System.out.println("���� typed");
	}

	public void keyReleased(KeyEvent event){
		System.out.println("���� released");
	}

}
