package filereaderhomework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws FileNotFoundException {
		File file =new File("C:\\Users\\HP\\eclipse-workspace\\HomeWork-6\\filereader-captmidn.txt");
		Scanner scan = new Scanner(file);
		`
		while (scan.hasNextLine())
		System.out.println(scan.nextLine());
		
	}

}
