package gui;

import java.awt.*; //������������ ���ϴ�.... �� 

class LoginForm extends Frame{ //������ ������... is a ����
	//has ����� ��������� ��ü���ϋ� �ǹ��Ѵ�..
	Label la_id;
	Label la_pass;
	TextField t_id;
	TextField t_pass;
	Button bt_login;
	Button bt_regist;
	Panel p_center;	// ���Ϳ� �׸��� ������ �г�
	Panel p_south; //���ʺ��� �г�(��ư2��)

	public LoginForm(){
		//��ǰ����� ������ �������� ��� 
		la_id = new Label("ID");
		la_pass = new Label("Password");
		t_id = new TextField(15);
		t_pass = new TextField(15);
		bt_login  = new Button("Login");
		bt_regist = new Button("����");
		p_center = new Panel();
		p_south = new Panel();
		//��������� ���� ���� ������..


		//����
		//Frame �� �����ڰ� ���̾ƿ��� �������� ������ ����Ʈ�� BorderLayout �̴� 
		//this.setLayout(new BorderLayout());  �� �ʿ���� BorderLayout �� �̹� ����Ʈ��
		p_center.setBackground(Color.GREEN);
		this.add(p_center,BorderLayout.CENTER);


		p_south.setBackground(Color.YELLOW);
		this.add(p_south,BorderLayout.SOUTH);
		
		p_center.setLayout(new GridLayout(2,2));//2�� 2��¥�� �׸��� ����
		p_center.add(la_id);
		p_center.add(t_id);
		p_center.add(la_pass);
		p_center.add(t_pass);


		//Panel �� �ƹ��� ��ġ�����ڸ� �������������� ����Ʈ�� FLOWLAYOUT �̴� 
		p_south.add(bt_login);
		p_south.add(bt_regist);
		
		this.setSize(400,150);		
		this.setVisible(true);
	}


	public static void main(String[] args) {
		new LoginForm();
	}
}
