package gui;
import java.awt.Frame; //����Ϸ��� Ŭ������ ��ġ ���
					   // ��𳫿� .class �� �����ϱ� : ������ ��밡���� ���̴�...
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.Image;
import java.awt.Toolkit;
class App1{
	public static void main(String[] args) {
		/*������ ����*/

		/*����ó�� ���� Ŭ������ �������� ��ó��
			����,��ó �ڼ�1) ����Ϸ��� Ŭ������ ���� � �������� �����Ǵ°����� �� �뵵�ľ�
			����,��ó �ڼ�2) �ڹ��� ��� ��ü�� �ᱹ 3���� �����ۿ� ����
			����,��ó �ڼ�3) Ŭ������ ����� ������̴�, ���� �޸𸮿� �ø��¹��� �˸�ȴ�.
			1)�Ϲ�Ŭ���� : new �ϸ� �ȴ�!! new ���� ������ ����(api����)
			2)�߻�Ŭ���� : new �Ұ��ϹǷ� �ڽ��� �����ؼ� new �ϰų� �̹� ������ �ν��Ͻ��� �̿��ϸ� �ȴ�(api ���� ����)
			3)�������̽� : new �Ұ��ϹǷ� �ڽ��� �����ؼ� new �ϰų� �̹� ������ �ν��Ͻ��� �̿��ϸ� �ȴ� (api ��������)

		*/

		Frame frame = new Frame();
		//frame �� ����Ʈ�� ���� ������ �ʴ� �����̴�. ���� ���̵��� �޼��� ȣ��.
		//
		frame.setVisible(true);
		frame.setBounds(500,400,300,400); // left,top,width,height
		
		FlowLayout flow = new FlowLayout();
		
		//ũ�⸦ �����ϱ����� ���̾ƿ� ��Ÿ���� �����ؾ��Ѵ�
		//�ϴ� flowlayout�� ���
		frame.setLayout(flow);
	
	
		Label la = new Label("ȸ������ ����Դϴ�");
		frame.add(la);
	
	
		TextField tf1 = new TextField("",20);
		frame.add(tf1);	//textbox �� ������ �����̳ʿ� �����ϱ�

		//������ ���� �Ϸ� ,�ȿ���ġ�� ���� ������Ʈ ��ġ
		//1.��ư ���� �Ϲ� �߻� �����߿� Ŭ���� ����... �Ϲ��̱⿡ new 
		//java.awt.Button bt ����... ������ �ĺ����� ������...
		Button bt = new Button("�� ��ư");
		frame.add(bt); 	//��ư�� �����쿡 �����̳ʿ� ��������!

		Checkbox ck = new Checkbox("üũ�ڽ�",false);
		frame.add(ck); // üũ�ڽ� �����̳ʿ� �����ϱ�.


		TextArea ta = new TextArea("hello",5,20);
		frame.add(ta); // �ؽ�Ʈ������ �����̳ʿ� ����


		//�̹��� �ֱ�
		//image �� �߻�Ŭ�����̸� �÷���(win,mac,linux)�� ������ ������� ������ �ִ�.
		//�÷����� �°� ���������� Toolkit Ŭ�����κ��� �ڿ��� ���� �Ѵ�
		Toolkit kit =Toolkit.getDefaultToolkit(); // static �޼���!! ���� Ŭ�������� ���ٰ��� 
		//��Ŷ�� �̹��� ���û��� ��η� ���� �������ִ�

		//��� ���� ��������: �������ô� ������OS ������ ����ϴ� ǥ���̹Ƿ�,
		//���� �� �ڹ��ڵ尡 ��� OS ����Ƿ���, ��� �߸����� ��η� �����Ѵ�.. 
		Image img = kit.getImage("C:/workspace/java_workspace/project1026/res/1.png");
		System.out.println("�̹��� �ּҰ���"+ img);

 

		
	
	}
}
