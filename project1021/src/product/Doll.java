class Doll{
	static String name="��ī��";
	int price;
	
	public Doll(int p){
		price=p;
	}
	//�����ڰ� �����ڸ� �����ϸ�, �� �̻� �����Ϸ��� ���� ������ ���Ǵ� ����
	public Doll(){
	
	}
	public static void main(String[] args){
		Doll.name="�׵𺣾�";  //(��)
		Doll d=new Doll();    //(��)
		d.name="�Ƿη�";         //(��)
	}	
}
