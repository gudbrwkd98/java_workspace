package use;
import animal.Duck;
import animal.Bird;

class UseAnimal{
	public static void main(String[] args) {
		Bird b = new Bird();
		Duck d = new Duck();

		b.fly();
		d.speak();
		d.fly();
		b.name();
		d.name();

		System.out.println("--------------");
		Bird bird = new Duck();
		bird.fly();
		bird.name();
		bird.speak();
		
	}
}
