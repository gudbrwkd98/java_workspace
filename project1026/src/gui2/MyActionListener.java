package gui2;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.TextField;

public class MyActionListener implements ActionListener{
	Button bt1,bt2;
	TextField t ;
	//�������̽��� �޼��� �������̵�(overriding)
	public MyActionListener(Button bt1,Button bt2,TextField t){
		this.bt1 = bt1;
		this.bt2 = bt2;
		this.t = t;
	}
	public void actionPerformed(ActionEvent e){
		Object obj = e.getSource();
		System.out.println(e);
		if(obj==bt1){
			System.out.print("bt1");
		}else if(obj == bt2){	
			System.out.print("bt2");
		}
	}
}
