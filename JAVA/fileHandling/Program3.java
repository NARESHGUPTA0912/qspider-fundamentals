package fileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Program3 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		File f1=new File("fileHandling/User.txt");
		try {
                    try (FileWriter fw = new FileWriter(f1, true)) {
                        fw.write("Mohan and sohan are here.\n");
                        fw.write("It is java class.\n");
                        fw.write("============\n");
                        System.out.println("File writing is completed!");
                    }
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program Ends!");
	}

}
