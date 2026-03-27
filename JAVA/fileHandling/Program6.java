package fileHandling;

import java.io.File;
import java.io.FileReader;

public class Program6 {
	public static void main(String[] args) {
		System.out.println("Program STarts");
		File f1=new File("f:\\Factorial1.java");
		try {
			FileReader fr=new FileReader(f1);
			int x=fr.read();
			while(x!=-1) {
				System.out.print((char)x);
			x=fr.read();
			}
			System.out.println("\nFile Reading is Completed!");
		}catch(Exception e) {
			System.out.println("File NOT Found!");
		}
		System.out.println("Program Ends!");
	}

}
