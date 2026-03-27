package dowhile;

import java.util.Scanner;

public class Power {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char c;
		do{
			System.out.println("Enter a: ");
			int a=sc.nextInt();
			System.out.println("Enter b: ");
			int b=sc.nextInt();
			int power=getPower(a,b);
			System.out.println(a+" to the power "+b+" is: "+power);
			System.out.println("Press Y/y to continue...");
			c=sc.next().charAt(0);
		}while(c=='Y' || c=='y');
		System.out.println("======Program Ends=========");
	}

	public static int getPower(int a, int b){
		int pow=1;
		int i=1;
		while(i<=b){
			pow*=a;
			i++;
		}
		return pow;
	}
}
