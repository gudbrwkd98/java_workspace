public class Hero {
	int hp=10;
	boolean fly=false;
	String name="메가맨";
	Bullet bullet;

	
	public void setHp(int a) { //hp 값을 변경하고 싶다 
	hp = a;
	}
	public void setFly(boolean b) {//fly 값을 변경하고 싶다
	fly = b;
	}
	public void setName(String n) {//name 값을 변경하고 싶다		
	name = n;
	}
	public void fire(Bullet bullet){//bullet 을 다른 무기로 변경하고 싶다
		this.bullet = bullet;
	}

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.setHp(30);
		System.out.println(hero.hp);
		hero.setFly(true);
		System.out.println(hero.fly);
		hero.setName("록맨");
		System.out.println(hero.name);
		Bullet b = new Bullet();
		hero.fire(b);		
	}	
}
