package fileHandling;
import java.io.File;
import java.io.IOException;
public class Program2 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		File f1=new File("C:\\Users\\Public\\Qspider Classes\\JAVA\\fileHandling\\myfile.txt");
		try {
			f1.createNewFile();
			System.out.println("File is Created!! here");
			System.out.println(f1.length());
			f1.setWritable(false);
		}catch(IOException e) {
			System.out.println("File is Not Created");
			System.out.println("Location Not Found");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program Ends!");
	}

}
	