package newPackage;

import java.awt.RenderingHints.Key;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class LinkListJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> s = new LinkedList<Integer>();
		s.add(4);
		s.add(5);
		s.add(1);
//		s.addAll(3,4,64);
		s.add(3);
		s.add(4);
		System.out.println(s);
		//Collections.sort(s);
//		List<Integer> abc = new ArrayList<Integer>();
		//removeDuplicate(s);
		removeDup(s);
		System.out.println(s);
	}

	

	private static void removeDup(LinkedList<Integer> s) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, Integer> hm =new Hashtable() ;
		for(int e: s ){
			if (!(hm.containsKey(e))){
				hm.put(e, 1);
			
			}
			
			System.out.println(e);
		}
		
		for (Iterator it=hm.entrySet().iterator(); it.hasNext();){
		String	its=  it.next().toString();
		System.out.print("hehehe");	
		System.out.println(its);
		}
	s.clear();
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
		    Integer key = entry.getKey();
		    Integer value = entry.getValue();
		    // ...
		   s.add(key);
		
		}

	}

}
