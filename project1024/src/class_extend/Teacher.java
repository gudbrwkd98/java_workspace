package class_extend;

public class Teacher extends School{
	public Teacher(){
		System.out.println("�� Ȯ�� ���α׷�");
	}
	
	public String getBan(String name){
		return super.getBan(name);
	}
}
