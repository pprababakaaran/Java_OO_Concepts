package com.onmobile;

public final class Test4 {

	private boolean flag = true;
	
	
	
	public void sample()
	{
		System.out.println("sample");
	}
	class Inner {
		void test()
		{
			if(Test4.this.flag)
			{
				sample();
			}
		}
	}
	
	public Test4()
	{
		(new Inner()).test();
	}
	
	public static void main(String args[]) {
		int a[] = new int[20];

		int l = a.length;
		new Test4();
	}
}
