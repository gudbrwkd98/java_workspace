package class_extend;

public class Teacher extends School{
	public Teacher(){
		System.out.println("반 확인 프로그램");
	}
	
	public String getBan(String name){
		return super.getBan(name);
	}
}
