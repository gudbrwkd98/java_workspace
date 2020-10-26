class Doll{
	static String name="피카츄";
	int price;
	
	public Doll(int p){
		price=p;
	}
	//개발자가 생성자를 정의하면, 더 이상 컴파일러에 의한 생성자 정의는 없다
	public Doll(){
	
	}
	public static void main(String[] args){
		Doll.name="테디베어";  //(가)
		Doll d=new Doll();    //(나)
		d.name="뽀로로";         //(다)
	}	
}
