package gui;

import java.awt.*; //나쁜짓이지만 편하다.... ㅠ 

class LoginForm extends Frame{ //프레임 윈도우... is a 관계
	//has 관계는 멤버변수가 객체형일떄 의미한다..
	Label la_id;
	Label la_pass;
	TextField t_id;
	TextField t_pass;
	Button bt_login;
	Button bt_regist;
	Panel p_center;	// 센터에 그리드 적용할 패널
	Panel p_south; //남쪽붙일 패널(버튼2개)

	public LoginForm(){
		//부품관계로 보유한 변수들을 모두 
		la_id = new Label("ID");
		la_pass = new Label("Password");
		t_id = new TextField(15);
		t_pass = new TextField(15);
		bt_login  = new Button("Login");
		bt_regist = new Button("가입");
		p_center = new Panel();
		p_south = new Panel();
		//여기까지가 생성 아직 조립전..


		//조립
		//Frame 은 개발자가 레이아웃을 지정하지 않으면 디폴트가 BorderLayout 이다 
		//this.setLayout(new BorderLayout());  할 필요없다 BorderLayout 이 이미 디폴트라서
		p_center.setBackground(Color.GREEN);
		this.add(p_center,BorderLayout.CENTER);


		p_south.setBackground(Color.YELLOW);
		this.add(p_south,BorderLayout.SOUTH);
		
		p_center.setLayout(new GridLayout(2,2));//2행 2열짜리 그리드 적용
		p_center.add(la_id);
		p_center.add(t_id);
		p_center.add(la_pass);
		p_center.add(t_pass);


		//Panel 은 아무런 배치관리자를 적용하지않으면 디폴트가 FLOWLAYOUT 이다 
		p_south.add(bt_login);
		p_south.add(bt_regist);
		
		this.setSize(400,150);		
		this.setVisible(true);
	}


	public static void main(String[] args) {
		new LoginForm();
	}
}
