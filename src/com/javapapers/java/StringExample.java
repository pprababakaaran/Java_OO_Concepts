package com.javapapers.java;

import java.text.MessageFormat.Field;

import com.learning.test.LoadTest;


public class StringExample {
	public static void main(String[] args){
		jack();
		jill();
		}
		public static void jack() {
		String s1 = "hill5";
		String s2 = "hill"+"5";
		String s3 = new String("hill5");
		String s4 = "hill";
		String s5 = s4+"5";

		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s5);
		System.out.println(s5);

		System.out.println("jack s1::" + System.identityHashCode(s1));
		System.out.println("jack s2::" + System.identityHashCode(s2));
		System.out.println("jack s3::" + System.identityHashCode(s3));
		System.out.println("jack s5::" + System.identityHashCode(s5));
		
		LoadTest t1 = new LoadTest();
		System.out.println(t1.add(10, 10));
		
		}
		public static void jill() {
		String s1 = "hill5";
		String s2 = "hill" + s1.length();
		System.out.println("Jill s1::" + System.identityHashCode(s1));
		System.out.println("Jill s2::" + System.identityHashCode(s2));
		System.out.println(s1==s2);
		}
		
		
	
}
