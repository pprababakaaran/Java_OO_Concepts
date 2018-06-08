package com.javapapers.java;

class FinalRetun

{

	public static void main(String args[])

	{

		FinalRetun fr = new FinalRetun();

		int ret = fr.returnValue();

		System.out.println("return value" + ret);

	}

	public int returnValue()

	{

		try

		{

			int a = 0;

			int b = 5;

			//int c = b / a;

			//System.out.println("c  value " + c);

			//System.exit(0);

			return 5;

		}

		catch (Exception e)

		{

			System.out.println("Exception caught as ....." + e);

			return 1;

		}

		finally

		{

			System.out.println("Finally Block.........");

			// System.exit(0);

			return 2;

		}

	}

}