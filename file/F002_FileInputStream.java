package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class F002_FileInputStream {
	public static void main(String[] args) {
		
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:\\Chintan_work\\Files\\home.txt");
			
			int i =  fis.read();
			while(i!=-1)
			{
				char ch = (char) i;
				System.out.print(ch);
				i = fis.read();
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
