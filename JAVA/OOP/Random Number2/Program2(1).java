//Random Number in a Range
import java.util.Random;
class Program2{
	public static void main(String[] args){
		Random r1=new Random();
		int min=170;
		int max=220;
		
		int randomNumber=min+r1.nextInt(max-min);
		System.out.println("Random Number is: "+randomNumber);
		
	}	
}



