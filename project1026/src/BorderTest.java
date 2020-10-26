package gui;

import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;

class BorderTest{
	public static void main(String[] args) {
		//������ ����
		Frame frame = new Frame();

		//��ư ����
		Button bt_north = new Button("North");
		Button bt_south = new Button("south");
		Button bt_west = new Button("west");
		Button bt_east = new Button("east");
		Button bt_center = new Button("CENTER");

		//borderlayout����
		frame.setLayout(new BorderLayout());
		
		//�����̳ʿ� ��ư �߰�
		frame.add(bt_north,BorderLayout.NORTH);	//����
		frame.add(bt_south,BorderLayout.SOUTH);//����
		frame.add(bt_west,BorderLayout.WEST);//����
		frame.add(bt_east,BorderLayout.EAST);//����
		
		frame.add(bt_center,BorderLayout.CENTER);//����... ���ʹ� ��������ʾƵ� ����ȴ�


		//������ ���̱� / ������ ����
		frame.setSize(250,200);
		frame.setVisible(true);
	}
}
