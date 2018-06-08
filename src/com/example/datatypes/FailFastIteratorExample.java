package com.example.datatypes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastIteratorExample {
	 public static void main(String[] args)
	    {
	        Map<String,String> premiumPhone = new HashMap<String,String>();
	        premiumPhone.put("Apple", "iPhone");
	        premiumPhone.put("HTC", "HTC one");
	        premiumPhone.put("Samsung","S5");
	        premiumPhone.put(null,"1");
	        premiumPhone.put(null,"2");

	        Iterator iterator = premiumPhone.keySet().iterator();
	        
	        while (iterator.hasNext())
	        {
	            System.out.println(premiumPhone.get(iterator.next()));
	            //premiumPhone.put("Sony", "Xperia Z");
	        }
	        
	    }
}
