package com.javapapers.java;

import java.util.ArrayList;
import java.util.List;

public class Class1 {
	public static void main(String[] args){
		
		List<ClassA> a = new ArrayList<ClassA>();

		
	}
	
	public class ClassA{
		void A(){
			System.out.println("ClassA A");
		}
	}

	public class ClassB extends ClassA{
		void A(){
			System.out.println("ClassB A");
		}
	}

	
}


