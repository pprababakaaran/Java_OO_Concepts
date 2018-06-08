package com.example.java8.features;

public class LambdaExpression {
	
	
	public static void main(String args[])
	{
		
		MathOperation addition = (int a, int b)->a+b;
		MathOperation subraction = (int a, int b)->a-b;
		MathOperation multiply = (a,b)->a*b;
		MathOperation division = (a, b)->a/b;
		
		LambdaExpression lambdaExpression = new LambdaExpression();
		
		System.out.println(lambdaExpression.operate(5,10,addition));
		System.out.println(lambdaExpression.operate(10,5,subraction));
		System.out.println(lambdaExpression.operate(5,10,multiply));
		System.out.println(lambdaExpression.operate(4,2,division));
		
		GreetingService greeting = message->System.out.println("HEllo"+message);
		greeting.messasge("Vanakkam");
	}
	
	
	int operate(int a, int b, MathOperation oper)
	{
		return oper.operation(a, b);
	}
	
	
	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService
	{
		void messasge(String msg);
	}

}



