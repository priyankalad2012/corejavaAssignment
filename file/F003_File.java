package file;

import java.io.File;
import java.io.IOException;

public class F003_File {
	public static void main(String[] args) {
		
		
		File file = new File("C:\\Chintan_work\\Files\\abc");
		
		
		file.mkdir();
		
//		System.out.println(file.isFile());
//		System.out.println(file.isDirectory());
//		if(file.exists())
//		{
//			System.out.println("file exist");
//			file.delete();
//			System.out.println("file deleted");
//		}
//		else
//		{
//			System.out.println("File not available");
//			try {
//				file.createNewFile();
//				System.out.println("File created");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
}
