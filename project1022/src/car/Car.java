package car;

public class Car{
	String brand;
	
	public Car(String brand){
		this.brand = brand;
		System.out.println("�ڽ��� super()�� ȣ��˴ϴ�");
	}

	public Car(){	//�Ű����� ������ �ٸ��Ƿ� �����ε���
					
	}
	public void Move(){
		System.out.println("���� ���ϴ�");
	}
}
