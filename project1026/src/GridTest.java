/*
awt/swing/fx -> 안드로이드
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
		Frame frame = new Frame("그리드 레이아웃");
		Panel p = new Panel();
		//레이아웃 메니져생성 및 등록
		GridLayout layout = new GridLayout(5,5);
		//FlowLayout layout = new FlowLayout();
//		frame.setLayout(layout); // 프레임에 레이아웃 적용!!
//		Button bt1 = new Button("버튼1");
//		Button bt2 = new Button("버튼2");
//		Button bt3 = new Button("로그인");
//		Button bt4 = new Button("회원가입");
//
//		Label la = new Label("ID : ");
//		p.add(la);
//
//		TextField tf1 = new TextField("",20);
//		p.add(tf1);	//textbox 를 윈도우 컨테이너에 부착하기
//
//
//		Label la2 = new Label("PW : ");
//		p.add(la2);
//
//		TextField tf2 = new TextField("",20);
//		p.add(tf2);	//textbox 를 윈도우 컨테이너에 부착하기
//
//	
//		frame.add(p);
//		p3.add(bt3);
//		p3.add(bt4);
//		
//		frame.add(p3,BorderLayout.SOUTH);
		
		frame.setLayout(layout); // 프레임에 레이아웃 적용!!
		
		for(int i = 0 ; i < 6 ; i++){

			frame.add(new Button("버튼"+i));
		}
		frame.setVisible(true);
		frame.setSize(300,200);
	}
}
