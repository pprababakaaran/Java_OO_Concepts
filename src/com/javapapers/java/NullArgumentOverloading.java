package com.javapapers.java;

public class NullArgumentOverloading {

	  public static void main(String[] args) {
		  
		    NullArgumentOverloading obj = new NullArgumentOverloading();
		    obj.overLoad(null);
		  }
	  private void overLoad(Object o) {
		    System.out.println("Object o argument method.");
		  }
	  private void overLoad(double[] dArray) {
		    System.out.println("double array argument method.");
		  }

}
