package use;
import fashion.down.Pants; //사용하고픈 클래스의 위치 등록~!

class UsePants{
	public static void main(String[] args) {
		Pants p = new Pants();
		System.out.println(p.name);
	}
}
