package fileHandling;
import java.io.File;
import java.io.FileReader;
public class Program5 {
	public static void main(String[] args) {
		System.out.println("Program STarts");
		File f1=new File("f:\\UserDetails.txt");
		try {
			FileReader fr=new FileReader(f1);
			int x=fr.read();
			System.out.print((char)x);
			x=fr.read();
			System.out.print((char)x);
		}catch(Exception e) {
			System.out.println("File NOT Found!");
		}
		
		
		System.out.println("Program Ends!");
	}

}
