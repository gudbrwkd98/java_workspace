package bank;//�����ҽ��� bank ��Ű���� �������� ���� �������մϴ�

/*���� ���¸� �����Ѵ�: ������ ��������...������ �����͸� ���� �ٷ�*/
//��Ű���� ���� Ŭ������ public ���� �������������� �ٸ� ��� Ŭ������ �� 
//Ŭ������ ����Ҽ� �����ϴ� �̰� ������ �ƴ϶� �׳� �ǹ̾��� ���Դϴ�.
//Ŭ������ ����� ����� ���̱⿡ ������ public ���� �����ϵ�, �׾��� ����鿡 ����
//����ó�� �ϸ�Ǵ°ſ���~
//���� public ���� �������ּ��� ~! 
public class Account{
	/*���¿� ������ �Ӽ��� �����ϰ� ���� �ð� ���ڽ��ϴ� */

	public String bank = "�������";//�����̸� 
	protected String customer; //���̸�
	String num = "022-388-87232"; //���¹�ȣ
	private int balance = 100000;//�ݾ�
	//�Ʒ��� �޼���� public �̹Ƿ� ��� ��ü�� �����Ҽ��־��
	//UseAccount �ܰ� �����ϰ� ��µ� �غ��ô�
	public void setBalance(int balance){
		this.balance = balance;
	}

	public int getBalance(){
		return balance;
	}

	 
}
