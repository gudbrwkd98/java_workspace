package animal;

public class Sparrow extends Bird{
	String name = "����";

	public void jjack(){
		System.out.println("±��");
	}

	//�ڽ��� �θ�� 100% ������ �޼��带 �����ϴ� ����� �������̵��̶��Ѵ�
	public void fly(){
		System.out.println("����");
	}

	public static void main(String [] args){
		Sparrow sp = new Sparrow();
		sp.fly(); //���� ���� 

		Bird b = new Bird();
		b.fly(); //�θ���� ����

		Bird a = new Sparrow(); 
		a.fly(); //������ ����
	}
}
