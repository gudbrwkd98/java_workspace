package music;

class UseDevice{
	public static void main(String[] args) {
		//AudioDevice ad = new AudioDevice();
		//�߻� Ŭ������ �ҿ����� Ŭ�����̹Ƿ� �ν��Ͻ� �����Ұ�
		//���� �ڽİ�ü�� �ϼ��ϸ� ����..
		AudioDevice ad = new speaker();
		//�ڽ� speaker ������ �ν��Ͻ�ȭ �ɼ� �ִ�

		//riding.Wing wing = new speaker();
		//wing.fly();

		//extedns �� implements �� �Ѵ� is a  �̴� 
		//���� ���ΰ� ���� ������ �ڷ������� ���ֵǸ� ����ȯ�� ����!
		//�ڽ��� �������̵��ϸ� �ڽ��� �޼��带 �ֿ켱 ȣ��

		AudioDevice s = new speaker();
		s.stop();

	}
}
