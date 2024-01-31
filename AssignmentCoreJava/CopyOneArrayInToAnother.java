package AssignmentCoreJava;

import java.util.ArrayList;

public class CopyOneArrayInToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
	
		
		ArrayList<Integer> al2 = new ArrayList<Integer>(al1);
		al2.add(4);
		al2.add(5);
		al2.add(6);
		al2.add(7);
		//al2.addAll(al1);
		
		
		for(int i : al2)
		{
			System.out.println(i);
		}

	}

}
