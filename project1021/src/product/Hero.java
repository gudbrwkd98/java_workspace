public class Hero {
	int hp=10;
	boolean fly=false;
	String name="�ް���";
	Bullet bullet;

	
	public void setHp(int a) { //hp ���� �����ϰ� �ʹ� 
	hp = a;
	}
	public void setFly(boolean b) {//fly ���� �����ϰ� �ʹ�
	fly = b;
	}
	public void setName(String n) {//name ���� �����ϰ� �ʹ�		
	name = n;
	}
	public void fire(Bullet bullet){//bullet �� �ٸ� ����� �����ϰ� �ʹ�
		this.bullet = bullet;
	}

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.setHp(30);
		System.out.println(hero.hp);
		hero.setFly(true);
		System.out.println(hero.fly);
		hero.setName("�ϸ�");
		System.out.println(hero.name);
		Bullet b = new Bullet();
		hero.fire(b);		
	}	
}
