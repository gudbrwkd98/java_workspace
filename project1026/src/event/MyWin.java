package event;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Choice;

class MyWin extends Frame{
	Button bt;
	TextField t;
	Choice ch ; //html���� select �ڽ��� ����
	public MyWin(){
		this.addWindowListener(new MyWindowListener()); //������ ������ ����
		bt = new Button("��ư");
		t = new TextField(15);
		ch = new Choice();
		ch.add("red");
		ch.add("blue");
		ch.add("green");
		this.setLayout(new FlowLayout());

		this.add(bt);
		this.add(t);
		this.add(ch);
		bt.addActionListener(new MyListener());//��ư�� ������ ����!!
		t.addKeyListener(new MyKey()); //�ؽ�Ʈ ������
		ch.addItemListener(new MyItem()); //���̽� ������
		this.setSize(300,400);
		this.setVisible(true);
		
		this.addMouseListener(new MyMouse());
	
	}
	public static void main(String[] args) {
		new MyWin();
	}
}
