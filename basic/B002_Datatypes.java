package basic;

public class B002_Datatypes {
	
	
	
	public static void main(String[] args) {

//		byte b = -128;
//		short s = 32767;
//		int i = 5656;
//		long l = 545454;
//
//		float f = 45.66454545455f;
//		double d = 465.65698985465465;
//
//		char ch = 'A';
//		boolean bool = true;

		// System.out.println(f);
		// System.out.println(d);
		
		//datatype casting : 
		
		//widning - implicite
		int k = 45;  // 4 
		long j = k;  // 8
		
		//nerrowing - explicite
		long m = 568598l; // 8
		int n = (int) m;     // 4
		
		
		int y = 'i';
		System.out.println(y);
		
		char ch = 78;
		System.out.println(ch);
	}
}
