class Car{
	String name = "Benz";
	String color = "red";
	int price = 500;
	Wheel wheel=null ; // ���ڵ尡 ����¢ ��������??
	//Ŭ������ �ȿ��� �ڷ����� ��� �ִµ�, �ڹ��� �ڷ����� �� 4���̴�.
	// ���� �� Ŭ���� �ȿ��� ����,����,���� �̿ܿ��� ��ü���� �ü��ִ�..
	// ��ü �ڷ����� �ڷ����̴ϱ�..

	//Ŭ������� ������ �̸��� �޼��带 ������ �����ڶ� �ϰ�,
	//�����ڴ� �̸������� �˼� �ֵ��� ��ü�� ����Ÿ�ӿ� ���� �ʱ�ȭ �۾��� ������,
	//�۾��� �����ϴ� �뵵�� �޼����̴�...
	public Car(){
	//this.wheel
		wheel = new Wheel();
	}

	public static void main (String [] args){
		//�ڵ����� �����ϰ�,
		//�� �ڵ��� �̸� ����ϰ�,
		//�� �ڵ��� ������ �귣��,����,������ ��±��� �Ͻÿ�

		Car c = new Car();
		System.out.println(c.name);
		System.out.println(c.color);
		System.out.println(c.price);
		System.out.println(c.wheel.brand);
		System.out.println(c.wheel.color);
		System.out.println(c.wheel.price);
	}
}
