import java.util.Random;
class Program1{
	public static void main(String[] args){
		Random r1=new Random();
		int randomNumber1=r1.nextInt();
		int randomNumber2=r1.nextInt(100);
		System.out.println("Random Number1 is: "+randomNumber1);
		System.out.println("Random Number2 is: "+randomNumber2);
	}	
}



