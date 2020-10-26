class ReturnType{
	int price;
	public void setPrice(){
		price = 500;
	}

	public int getPrice(){
		return price;
	}

	public boolean getBool(){
		return false;
	}

	public char getChar(){
		return 'A';
	}

	public double getNum(){
		return 89.756;
	}

	public static void main(String [] args){
		ReturnType rt = new ReturnType();

		System.out.println(rt.getNum());
		System.out.println(rt.getChar());

	}
}
