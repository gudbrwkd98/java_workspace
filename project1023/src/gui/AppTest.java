/*���ݱ����� �ֿܼ����� �ڹٸ� �����������,
�ڹٵ� �׷��� API �� �����Ѵ�.
������ ���� ����.. �ڹ��� ������� ��ư�� �����غ��� 
*/
package gui;
import java.awt.Frame;
import java.awt.Button;
class AppTest{
	public static void main(String[] args) {
	 //�ڹٿ����� ������ ������ ���ִ� Ŭ������ Frame�� �����Ѵ�
	 Frame frame;//sun���� ������ Ŭ������, ������ ����..
	 			// ���� sun ���� �����ϴ� ���Ĺ����� ���� ��ġ�� �˾Ƴ���!
	frame = new Frame(); //������ ����
	frame.setSize(300,400);//������ �����쿡 �ʺ�,�����ֱ�
	frame.setVisible(true); //�������� �Ӽ����̰�

		//��ư �����Ͽ�, �����ӿ� ���̱�!!
	Button bt = new Button("�� ��ư");
	frame.add(bt);

	}
}