/* use ��Ű������ Account ���� Ŭ������ �����غ��ڽ��ϴ�*/

/* ����� �Ϸ��� ���� ������ ���ʿ䰡 ����.. �����ϴ� �ʸ� �����ϸ� �˴ϴ�
	����� �� Ŭ������ ������ �ʿ䰡 ����
	UseAccount(����Ϸ��� ��ü) ---> Account(������ ��ü) �����Ǿ����
*/
package use;
//����Ϸ��� Ŭ������ ��ġ �˷��ݴϴ�.
import bank.Account; //bank ������ ��δ� �̹� class path �� ��ϵǾ�����
class UseAccount{
	public static void main(String[] args) {
		Account acc = new Account(); //���� Ŭ���� ���� (public �̶� ��������� ������ ������
		//���� ���������� ���� �����غ��ڽ��ϴ�.

		//bank ������� public ���� ����Ǿ������Ƿ� ������ ������ �����մϴ�
		System.out.println(acc.bank);
		//customer �� protected ����Ǿ� �����Ƿ� ��� ���迡 �ְų� ���� ��Ű��
		//�ΰ�� ���� ������ �����մϴ�.. ���� UseAccount �� Account�� ��Ӱ��谡 ����
		//���� �ٸ� ��Ű���̹Ƿ� ������ ������ �Ұ����Ұ̴ϴ� 
		//System.out.println(acc.customer);
		//���� num ������ �����ڰ� �ƹ��͵� ��������ʾҴµ��� �̷��� ���������ڴ� defult
		//�����ڶ� �Ѵ� ���� ��Ű���� �ִ� Ŭ���������� ������ ��� 
		//System.out.println(acc.num);
		//�Ѵܰ� �� ��ٷӴ� (�� ��Ӱ��谡 �־ ������Ű���� �ƴ϶�� ���� �Ұ�);
		
		//���� �ܾ� balance�� �׽�Ʈ �� ���ô�
		//balance�� ���� ������ ������������ private �� ����Ǿ������Ƿ�, Account Ŭ���� �����θ�
		//������ �����մϴ�.. ���� �츮�� Account �ڽ��� �ƴ϶�, �������� �����մϴ�
		//���� ���������...
		//System.out.println(acc.balance);
		acc.setBalance(10);
		System.out.println(acc.getBalance());
	}
}
