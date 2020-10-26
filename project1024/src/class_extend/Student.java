package class_extend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student extends Teacher{
	private String name;
	public Student(){
		super();
		start();
	}

	private void start(){
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("����� �̸��� �Է�");

		try{
		name = in.readLine();
		if(super.getBan(name) == null){
			System.out.println("�б��л��� �ƴմϴ�");
			return ;
		}else{
		System.out.println("����:" + super.getTeacher(name));
		System.out.println("����� ��:" + super.getBan(name));

		String [] friends = super.getFriends(name);
		System.out.println("��ģ��:");
		
		for(int i = 0 ; i < friends.length;i++){
			System.out.print(friends[i] + ",");
		}
		}
			
		}catch(IOException e){
			System.out.println("err");
		}
	}
	public static void main(String[] args) {
			new Student();
	}
}
