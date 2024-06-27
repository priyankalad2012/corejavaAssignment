package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {
	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("php");
		al.add("Android");
		al.add("ios");
		al.add("java");
		al.add(null);
		
		
		//al.add(1,"SQL");
		//al.set(1, "SQL");
		//al.remove(1);
		
		//System.out.println(al.size());
		
		System.out.println(al.get(2));
		
//		for(String s : al)
//		{
//			System.out.println(s);
//		}
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("*********************");
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
	
		
		ArrayList<Integer> al2 = new ArrayList<Integer>(al1);
		al2.add(50);
		al2.add(60);
		al2.add(70);
		al2.addAll(al1);
		
		for(int i : al2)
		{
			System.out.println(i);
		}
		
		
		
		
		
	}
}
