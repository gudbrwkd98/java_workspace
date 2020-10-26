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
		System.out.println("당신의 이름을 입력");

		try{
		name = in.readLine();
		if(super.getBan(name) == null){
			System.out.println("학교학생이 아닙니다");
			return ;
		}else{
		System.out.println("담임:" + super.getTeacher(name));
		System.out.println("당신의 반:" + super.getBan(name));

		String [] friends = super.getFriends(name);
		System.out.println("반친구:");
		
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
