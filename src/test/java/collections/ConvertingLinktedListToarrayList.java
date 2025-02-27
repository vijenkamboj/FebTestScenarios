package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ConvertingLinktedListToarrayList {
	
	public static void main(String[] args)
	{
		LinkedList<Integer> ls=new LinkedList<Integer>();
		ls.add(44);
		ls.add(20);
		ls.add(3);
		ls.add(76);
		System.out.println(Collections.max(ls));
		System.out.println(Collections.min(ls));
	
	Collections.sort(ls);//ascending order
	System.out.println(ls);
	System.out.println(ls.get(0));
	System.out.println(ls.get(ls.size()-1));
	
	//coverting linked list to array list
	ArrayList<Integer> al=new ArrayList<Integer>(ls);
	System.out.println(al);
	
	}

}
