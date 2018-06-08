package com.javapapers.java;

public class StringLength {
	
	
	public static int length(String s) {
		int count = 0;
		for(char c:s.toCharArray() ){
			count++;
		}
		return count;
	}
	
	public static int length1(String s) {
		int count = 0;
		try{
			while(true){
				s.charAt(count);
				count++;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public static int convertStringToInt(String s){
		
		int i = 0, number = 0;
        boolean isNegative = false;
        int len = s.length();
        if( s.charAt(0) == '-' ){
            isNegative = true;
            i = 1;
        }
        while( i < len ){
            number *= 10;
            number += ( s.charAt(i++) - '0' );
        }
        if( isNegative )
        number = -number;
        return number;
    
	}
	
	   public static boolean isPalindrome(String str)
	    {
	        return checkPalindorome(str,0,str.length()-1);
	        
	    }
	    public static boolean checkPalindorome(String str,int low, int high)
	    {  if(high <= low)
	        return true;
	        else if (str.charAt(low)!= str.charAt(high))
	        return false;
	        else
	        return checkPalindorome(str,low+1,high-1);
	        
	        
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StringLength.length1("TEsting"));
		int a = StringLength.convertStringToInt("-12345");
		System.out.println("" +a);
		
		System.out.println("Is palindrome :" +StringLength.isPalindrome("121"));

	}

}
