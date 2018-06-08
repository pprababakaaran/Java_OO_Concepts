package com.example.threadpool;

public class Worker implements Runnable{

	private MyQueue<Runnable> myQueue;
	private String name;
	
	public Worker(MyQueue<Runnable> queue, String name)
	{
		this.myQueue = queue;
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Runnable r = myQueue.dequeue();
		System.out.println(" Taken Item by thread name:" + this.name );
		r.run();
		System.out.println(" Task completed of thread:" + this.name);
		
	}
	
	
}
