package AssignmentCoreJava;

import java.util.ArrayList;

public class updateSpecificArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>al=new ArrayList<String>();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		al.add("6");
		al.add("7");
		
		al.set(2, "Three");
		
		for (String s : al) {
			System.out.println(s);
		}

	}

}
