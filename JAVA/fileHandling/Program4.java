package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Program4 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Scanner sc=new Scanner(System.in);
		File f1=new File("f://UserDetails.txt");
		try {
                    try (FileWriter fw = new FileWriter(f1, true)) {
                        System.out.println("Enter the Name: ");
                        String name=sc.nextLine();
                        System.out.println("Enter age: ");
                        int age=sc.nextInt();
                        System.out.println("Enetr the Weight: ");
                        double weight=sc.nextDouble();
                        fw.write("Name is: "+name+"\n");
                        fw.write("Age is: "+age+" Years\n");
                        fw.write("Weight is: "+weight+" Kg\n");
                        fw.write("============\n");
                        System.out.println("File writing is completed!");
                    }
sc.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program Ends!");
	}

}
