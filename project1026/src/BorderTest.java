package gui;

import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;

class BorderTest{
	public static void main(String[] args) {
		//프레임 정의
		Frame frame = new Frame();

		//버튼 정의
		Button bt_north = new Button("North");
		Button bt_south = new Button("south");
		Button bt_west = new Button("west");
		Button bt_east = new Button("east");
		Button bt_center = new Button("CENTER");

		//borderlayout적용
		frame.setLayout(new BorderLayout());
		
		//컨테이너에 버튼 추가
		frame.add(bt_north,BorderLayout.NORTH);	//북쪽
		frame.add(bt_south,BorderLayout.SOUTH);//남쪽
		frame.add(bt_west,BorderLayout.WEST);//서쪽
		frame.add(bt_east,BorderLayout.EAST);//동쪽
		
		frame.add(bt_center,BorderLayout.CENTER);//센터... 센터는 명시하지않아도 적용된다


		//프레임 보이기 / 사이즈 정의
		frame.setSize(250,200);
		frame.setVisible(true);
	}
}
