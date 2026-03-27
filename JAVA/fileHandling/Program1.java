package fileHandling;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the 1st Number: ");
			int n1=sc.nextInt();
			System.out.println("Enter the 2nd No: ");
			int n2=sc.nextInt();
			System.out.println(n1+"+"+n2+"= "+(n1+n2));
			System.out.println(n1+"-"+n2+"= "+(n1-n2));
			try {
				System.out.println("This is try block");
				System.out.println(n1+"/"+n2+"= "+(n1/n2));
				System.out.println("Try block ends!");
			}catch(Exception e) {
				System.out.println(n1+"/"+n2+"= Infinity");
			}
			System.out.println(n1+"*"+n2+"= "+(n1*n2));
		}
		System.out.println("Program Ends!");
		
	}

}
