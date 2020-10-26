package animal;

public class Tiger
{
    String area;
    
    public Tiger() {
        this.area = "\uc544\ud504\ub9ac\uce74";
    }
    
    public void hunt() {
        System.out.println("\uc0ac\ub0e5\ud574\uc694");
    }

	public static void main(String [] args){
		Tiger t = new Tiger() ;

		System.out.print(t.area);
		t.hunt();
	}
}