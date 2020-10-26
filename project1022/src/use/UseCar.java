package use;
import car.Bus;
import car.Taxi;
import car.Truck;
class UseCar{
	public static void main(String[] args) {
		Taxi t = new Taxi();
			t.pass();
			t.Move();
		/*Bus b = new Bus();
			b.Move();
			b.line();
		Truck tr = new Truck();
			tr.Move();
			tr.dump();*/
	}		
}
