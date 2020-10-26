package problems;
import java.util.Scanner;


class sugar{
	public static int fibonacci(int i,int cz,int co) {
		
		if(i==0){
			System.out.print("0");
			return cz++ ;
		}else if(i==1){
			System.out.print("1");
			return co++ ;
		}else{
			return fibonacci(i-1,cz,co) + fibonacci(i-2,cz,co);
		}
	}
	public static void main(String[] args) {
			int b = 3 ;
			int countZ = 0 ;
			int countO = 0 ;
			fibonacci(b,countZ,countO);

			System.out.print(countZ + " " + countO);
    }

	
}
