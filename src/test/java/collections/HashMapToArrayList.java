package collections;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"vijender");
		map.put(2,"kumar");
		ArrayList<String> ls=new ArrayList<String>(map.values());
		for(int i=1;i<ls.size();i++)
		{
			System.out.println(ls);
		}

	}

}
