package com.java.org;

public class Pojo_C {

	public static void main(String[] args) {
		
		Pojo_A a=new Pojo_A();
		int id = a.getId();
		System.out.println(id);
		
		String name = a.getName();
        System.out.println(name);
        
        a.setId(15);
        a.setName("Seetha Raman");
        
        int id2 = a.getId();
        System.out.println(id2);
        
        String name2 = a.getName();
        System.out.println(name2);
	}
	
}
