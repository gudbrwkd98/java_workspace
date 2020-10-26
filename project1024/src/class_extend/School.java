package class_extend;

public class School{
	public String school_name = "Commin";
	public String school_class = "Middle School";
	
	private String [][] class_student_name = {
		{"1c1","1c2","1c3"},
		{"2c1","2c2","2c3"},
		{"3c1","3c2","3c3"}
	};

	private String [] class_teacher_name = {"1cT","2cT","3cT"};

	public void school(){
		System.out.println(school_name+ " " + school_class);
	}

	public String getBan(String name){
		for(int i = 0 ; i < class_student_name.length;i++){
			for(int j = 0 ; j < class_student_name[i].length; j++){
				if(class_student_name[i][j].equals(name)){
					return (i+1)+" ";
				}
			}
		}
		return null;
	}

	public String getTeacher(String student_name){
		for(int i = 0 ; i < class_student_name.length; i++){
			for(int j = 0 ; j < class_student_name[i].length;j++){
				if(class_student_name[i][j].equals(student_name)){
					return class_teacher_name[i];
				}
			}
		}
		return null;
	}

	public String[] getFriends(String student_name){
		for(int i = 0 ; i < class_student_name.length;i++){
			for(int j = 0 ; j < class_student_name[i].length;j++){
				if(class_student_name[i][j].equals(student_name)){
					return class_student_name[i];
				}
			}		
		}
		return null;
	}


}