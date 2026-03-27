//Random Number of 4 digit
class Program4{
	public static void main(String[] args){

		int min=1000;
		int max=10000;

		int randomNumber=min+(int)(Math.random()*(max-min));
		System.out.println("4 Digit OTP is: "+randomNumber);


	}	
}



