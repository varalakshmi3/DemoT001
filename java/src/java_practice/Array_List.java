package java_practice;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.*;

public class Array_List {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("grapes");
		list.add("Apple");
		list.add("Orange");
		
		int count,max_count=0;
		
		Map<String,Integer> hs=new HashMap<>();
		Iterator<String> ite=list.iterator();
				for(String s:list)
				{
					if(hs.containsKey(s))
					{
						hs.put(s, hs.get(s)+1);
					}
					else
					{
						hs.put(s, 1);
					}
				}
		
		
	//	System.out.println(hs);
				
				for(Map.Entry<String,Integer> st:hs.entrySet())
				{
					System.out.println(st.getKey()+"  " +st.getValue());
				}
			

	}

}
