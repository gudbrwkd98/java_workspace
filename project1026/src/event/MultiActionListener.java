package event;

import java.awt.event.*;

public class MultiActionListener implements ActionListener{
		//�̸޼���� ��� ��ư�� ����ȴ�
	public void actionPerformed(ActionEvent e){
		//������ �߻���Ų �̺�Ʈ�� ���� ��� ������ event �ν��Ͻ��� ���޵�
		//� ��ư�� ���Ǵ����� �˼��ִ�
		System.out.println(e.getSource());

		//�̺�Ʈ ��ü�� �޼��� �߿� �̺�Ʈ�� ����Ų ������Ʈ�� �����ϴ� �޼���
		if(e.getActionCommand() == "��ư1"){
		System.out.println("�� ������1?");
		}else{
		System.out.println("�� 1?");
		}
	}
}
