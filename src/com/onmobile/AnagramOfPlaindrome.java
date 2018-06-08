package com.onmobile;

public class AnagramOfPlaindrome {
	
	public static boolean checkPalindrome(String input)
	{
	        int [] count = new int[26];
	        for( int i = 0; i < input.length(); i++ )
	        {
	            char ch = input.charAt(i);
	            System.out.println(ch-'a');
	            count[ch-'a']++;
	        }
	        int oddOccur = 0;
	        for( int cnt:count )
	        {
	            if( oddOccur > 1) // more than 1 char should have odd frequency
	                return false;
	            if( cnt%2 == 1 )
	                oddOccur++;
	        }
	        return true;
	}
	
	public static void main(String args[])
	{
		System.out.println(AnagramOfPlaindrome.checkPalindrome("keep"));
	}

}
