class  Computer{
	String company="����";
	int price=130;

	public int getPrice(){
		return price;
	}
	public void setValue(String c, int p){
		company=c;
		price=p;
	}
		public static void main(String[] args){
		Computer com=new Computer();
		com.setValue("�Ｚ",200);
		int a=com.price;
		int b=com.getPrice();
		System.out.println("a+b ����� "+(a+b));
	}
}




