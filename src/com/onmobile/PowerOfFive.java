package com.onmobile;

public class PowerOfFive {

	public static int numsOfWays (String s ){
		long [] f = new long [s.length() + 1] ;
		f[0] = 0;	
		for (int i = 1 ; i <= s.length() ;++i) {
			f[i] = Integer.MAX_VALUE;
		 for (int j = 1 ; j <= i ;++j) {
			 if (s.charAt(j - 1) == '0'){
				 continue ;
			 }
			 int num = Integer.parseInt(s.substring(j - 1, i), 2) ;				 
			 if (isPower(num)) {
				 f[i] = Math.min(f[i], f[j - 1] + 1) ;				 
			 }			 
		 }
		}								
		return f[s.length()] == Integer.MAX_VALUE ? -1 : (int)f[s.length()] ;
	}
	
	private static boolean isPower (long val){
		if (val == 0) {
			return false ;
		}
		int n = (int)(Math.log(val) / Math.log(5));
		return Math.pow(5, n) == val;
	}
	
	
	public static void main(String args[])
	{
		System.out.println("" +numsOfWays("101101101"));
	}
}
