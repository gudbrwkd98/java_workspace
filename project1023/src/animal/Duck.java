package animal;
public class Duck extends Bird{
	/*Duck is a Bird
	  Duck ���� Bird ���̴�
	  ������ ����
	*/

	String name = "�� ����";
		public void quack(){
			System.out.println("�в�");
		}

	public static void main(String [] args){
		Duck d1 = new Duck();
		Duck d2 = new Duck();

		Bird b = new Bird();

		//Bird b = new Duck(); // �� �� ���� 
		Duck a = new Duck();
		Bird r = new Bird();
		r = a ;
		a = (Duck)r; //�ڷ��� Ŭ������ �ڷ��� Duck �� Duck Bird �� Bird 
		// �� <---- ū �����ͺ�����ȯ�� downcasting
		// ū (---- �� upcasting  

		//��� : ��ü �ڷ����� �ڷ����̹Ƿ� �⺻�ڷ����� ��Ģ�� ���κ� �״�� ����ǰ��ִ�

	}
}
