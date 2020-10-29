package event;

import java.awt.event.*;

public class MultiActionListener implements ActionListener{
		//이메서드로 모든 버튼이 실행된다
	public void actionPerformed(ActionEvent e){
		//유저가 발생시킨 이벤트에 대한 모든 정보가 event 인스턴스로 전달됨
		//어떤 버튼이 눌렷는지도 알수있다
		System.out.println(e.getSource());

		//이벤트 객체의 메서드 중에 이벤트를 일으킨 컴포넌트를 추출하는 메서드
		if(e.getActionCommand() == "버튼1"){
		System.out.println("나 눌렀어1?");
		}else{
		System.out.println("나 1?");
		}
	}
}
