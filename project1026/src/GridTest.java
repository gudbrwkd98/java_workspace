/*
awt/swing/fx -> �ȵ���̵�
*/
package gui;
import java.awt.GridLayout;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.TextField;

class GridTest{
	public static void main(String[] args) {
		Frame frame = new Frame("�׸��� ���̾ƿ�");
		Panel p = new Panel();
		//���̾ƿ� �޴������� �� ���
		GridLayout layout = new GridLayout(5,5);
		//FlowLayout layout = new FlowLayout();
//		frame.setLayout(layout); // �����ӿ� ���̾ƿ� ����!!
//		Button bt1 = new Button("��ư1");
//		Button bt2 = new Button("��ư2");
//		Button bt3 = new Button("�α���");
//		Button bt4 = new Button("ȸ������");
//
//		Label la = new Label("ID : ");
//		p.add(la);
//
//		TextField tf1 = new TextField("",20);
//		p.add(tf1);	//textbox �� ������ �����̳ʿ� �����ϱ�
//
//
//		Label la2 = new Label("PW : ");
//		p.add(la2);
//
//		TextField tf2 = new TextField("",20);
//		p.add(tf2);	//textbox �� ������ �����̳ʿ� �����ϱ�
//
//	
//		frame.add(p);
//		p3.add(bt3);
//		p3.add(bt4);
//		
//		frame.add(p3,BorderLayout.SOUTH);
		
		frame.setLayout(layout); // �����ӿ� ���̾ƿ� ����!!
		
		for(int i = 0 ; i < 6 ; i++){

			frame.add(new Button("��ư"+i));
		}
		frame.setVisible(true);
		frame.setSize(300,200);
	}
}
