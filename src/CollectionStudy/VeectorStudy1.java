package CollectionStudy;

import java.util.Vector;

public class VeectorStudy1 {

	public static void main(String[] args) {

		
		Vector<Object>v=new Vector<Object>();
		v.add("Good");
		v.add('A');
		v.add(true);
		v.add(null);
		v.add(null);
		v.add("Good");
		v.add(12);
		v.add(12.12);
		
		System.out.println(v);
		v.add(1,"Morning");
		System.out.println(v);
		
		v.addFirst("Pune");
		v.addLast("MH");
		System.out.println(v);
		
		
		System.out.println(v.size());
		
		System.out.println(v.capacity());
		
		
		//v.vector
		
		Object v1=v.clone();
		System.out.println(v1);
		
		System.out.println(v.contains("Pune123"));
		
		System.out.println(v.elementAt(1));//grt()
         
		v.ensureCapacity(25);
		System.out.println(v.capacity());
		
		System.out.println(v.equals(v1));
		
		System.out.println(v.get(0));
		
		System.out.println(v.indexOf(12));
		
		v.insertElementAt("Mumbai", 1);
		System.out.println(v);
		
		//v.clear()
		
		System.out.println(v.isEmpty());
		
		System.out.println(v.lastIndexOf("Good"));
		
		System.out.println(v.remove(0));
		System.out.println(v);
		v.set(0, "INDIA");
		System.out.println(v);
		
		//for
		//foe each
		//iterator
		//list iterator
		
		for(Object a:v)
		{
			System.out.println(a);
		}
		
		
	}

}
