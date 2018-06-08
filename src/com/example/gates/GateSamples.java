package com.example.gates;

public class GateSamples {

	public static void main(String args[])
	{
		boolean a = true;
		boolean b = true;
		
		//AND Gate
		System.out.println("AND : "+(a && b));
		
		//OR Gate
		System.out.println("OR : "+(a || b));
		
		//XOR Gate
		System.out.println("XOR : "+(a ^ b));
		
		//NAND gate
		System.out.println("NAND : "+!(a && b));
		
		//Add two numbers without arithemic operator
		System.out.println(Add(12,509));

	}
	
	static int Add(int x, int y)
	{
	    // Iterate till there is no carry  
	    while (y != 0)
	    {
	        // carry now contains common set bits of x and y
	        int carry = x & y;  
	        
	        System.out.println(carry);
	 
	        // Sum of bits of x and y where at least one of the bits is not set
	        x = x ^ y; 
	        System.out.println(x);

	        // Carry is shifted by one so that adding it to x gives the required sum
	        y = carry << 1;
	    }
	    return x;
	}
}
