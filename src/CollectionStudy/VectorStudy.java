package CollectionStudy;

import java.util.ArrayList;
import java.util.Vector;


public class VectorStudy {

	public static void main(String[] args)
	{
		
		Vector<Object> v= new Vector<Object>();
		
		v.add("Pune");
		v.add("Solapur");
		v.add(true);
		v.add(null);
		v.add(null);
		v.add("Good");
		v.add(23);
		v.add(23.4);
		
		
		System.out.println(v);
		v.add(1,"City");
		System.out.println(v);
		
		v.addFirst("Sangali");
		v.addLast("MH");
		System.out.println(v);
		
		System.out.println(v.size());
		
		System.out.println(v.capacity());
		
		//v.clear();
		
		Object v1=v.clone();
		System.out.println(v1);
		
		System.out.println(v.contains("Sangali123"));
		
		System.out.println(v.elementAt(1));
		
		v.ensureCapacity(25);
		System.out.println(v.capacity());
		System.out.println(v.equals(v1));
		System.out.println(v.get(0));
		System.out.println(v.indexOf(23));
		
		
		
		v.insertElementAt("Sangola",1);
		
		System.out.println(v);
		System.out.println(v.isEmpty());
		
		System.out.println(v.lastIndexOf("Good"));
		
		System.out.println(v.remove(0));
		System.out.println(v);
		v.set(0, "INDIA");
		System.out.println(v);
		
		for(Object a:v)
		{
			System.out.println(a);
		}
		
	}

}
