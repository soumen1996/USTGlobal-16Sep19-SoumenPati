package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("Kukku", 998014);
		hm.put("Mala", 678941);
		hm.put("Sheela", 787897);
		hm.put(null, 456789);
		
		
		System.out.println("Data "+hm);
		
		hm.put("Mala", 789899);
		System.out.println("After Modify "+hm);
		
		hm.put("Dimple", 989899);
		System.out.println("After Dimple "+hm);
		hm.put(null, 78784);
		System.out.println("After Adding Duplicate null "+hm);
		System.out.println("=============");
		Object phoneno = hm.get("Sheela");
		System.out.println("Value "+phoneno);
		
		Object phoneno1 = hm.get("Meena");
		System.out.println("Value "+phoneno1);

		Object value = hm.remove("Kuku");
		System.out.println(value);
		
		
	}

}
