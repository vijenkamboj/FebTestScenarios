package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("rinku");
		list.add("Vijender");
		list.add("Kumar");
		
		Collections.reverse(list);
		System.out.println(list);

	}

}
