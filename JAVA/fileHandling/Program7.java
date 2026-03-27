package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Program7 {
	public static void main(String[] args) {
		System.out.println("Program STarts");
		File f1=new File("f:\\Factorial1.java");
		try {
			Scanner sc=new Scanner(f1);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
			System.out.println("File Reading is Completed!");
			sc.close();
		}catch(Exception e) {
			System.out.println("File NOT Found!");
		}
		System.out.println("Program Ends!");
	}

}
