package music;
abstract public class AudioDevice{
	abstract public void setVolume(); //�߻� �޼���� �Ѵ�
	abstract public void playMP3(); // �Ǵٸ� ��� ������ �߰� 
	void stop(){
		System.out.print("����");
	}
}
