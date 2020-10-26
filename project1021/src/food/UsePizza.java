class UsePizza{
	
	public void eat (Pizza p){
		p.slice = 3;
	}

	public void setSlice(int slice){
		slice = 3 ;
	}

	public static void main(String[] args) {
		Pizza p1 = new Pizza("ÇÍÀÚÇê");
		Pizza p2 = new Pizza("µµ¹Ì³ë");
		UsePizza up = new UsePizza();
		up.setSlice(5);
		up.setSlice(p1.slice);
		up.eat(p2);
		System.out.println(p2.slice);
		
	}
}
