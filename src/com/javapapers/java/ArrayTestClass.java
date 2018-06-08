package com.javapapers.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class ArrayTestClass {
    public static void main(String args[] ) throws Exception {
    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	System.out.println("Please Enter the number of elements..");
    	int noOfElements = Integer.parseInt(br.readLine());
    	int[] arrayElements =  new int[noOfElements];
    	
        if(noOfElements <1 && noOfElements > 100000)
        {
        	System.out.println("Input does not meet the constraints. Number of array element is less than 1 or greater than 100000.");
        	System.exit(0);
        }
        
        for (int i = 1; i <= noOfElements; i++) {
            System.out.println("Enter the value for Array Element "+i);
            arrayElements[i-1] = Integer.parseInt(br.readLine());
            if(arrayElements[i-1] <1 && arrayElements[i-1] > 1000000 )
            {
            	System.out.println("Input does not meet the constraints. Array element value is less than 1 or greater than 1000000.");
            	System.exit(0);
            }
        }
    	
        System.out.println("Please enter the number of Operations..");
        int noOfOperatios = Integer.parseInt(br.readLine());


        
        int[] operationsInput = new int[noOfOperatios];
       
        for (int j = 1; j <= noOfOperatios; j++) {
            System.out.println("Enter the value for Array Element "+j);
            operationsInput[j-1] = Integer.parseInt(br.readLine());
            if(operationsInput[j-1] <1 && operationsInput[j-1] > 1000)
            {
            	System.out.println("Input does not meet the constraints. Operation array value is less than 1 or greater than 1000.");
            	System.exit(0);
            }
        }
        
    	
    	for(int i =0;i<noOfElements;i++){
    		for(int j=0;j<noOfOperatios;j++)
    		{
    			arrayElements[i]=arrayElements[i]/operationsInput[j];
    		} 		
    		
    	}
    	System.out.print("Output is [");
    	for(int i =0;i<noOfElements;i++){
    		System.out.print(arrayElements[i]+" ");
    	}
    	System.out.print("]");
    }
}
