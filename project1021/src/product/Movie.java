class  Movie{
	String title;
	int price;

	public Movie(int p){
	    price=p;
	}
	public Movie(String t){
           title=t;
	}
	public static void show(){
	    System.out.println("movie start!");
	}

	public static void main(String[] args){
    	    Movie mv1 = new Movie(100);  //(°¡)
	    Movie.show();   //(³ª)
	}
}
