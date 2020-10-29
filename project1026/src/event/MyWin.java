package event;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Choice;

class MyWin extends Frame{
	Button bt;
	TextField t;
	Choice ch ; //html에의 select 박스와 동일
	public MyWin(){
		this.addWindowListener(new MyWindowListener()); //윈도우 리스너 연결
		bt = new Button("버튼");
		t = new TextField(15);
		ch = new Choice();
		ch.add("red");
		ch.add("blue");
		ch.add("green");
		this.setLayout(new FlowLayout());

		this.add(bt);
		this.add(t);
		this.add(ch);
		bt.addActionListener(new MyListener());//버튼과 리스너 연결!!
		t.addKeyListener(new MyKey()); //텍스트 리스너
		ch.addItemListener(new MyItem()); //초이스 리스너
		this.setSize(300,400);
		this.setVisible(true);
		
		this.addMouseListener(new MyMouse());
	
	}
	public static void main(String[] args) {
		new MyWin();
	}
}
