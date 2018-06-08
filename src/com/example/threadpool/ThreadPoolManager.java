package com.example.threadpool;

public class ThreadPoolManager {
	private final int THREADPOOL_CAPACITY;
	private MyQueue<Runnable> queue = new MyQueue<Runnable>();

	public ThreadPoolManager(int capacity)
	{
		this.THREADPOOL_CAPACITY = capacity;
		initAllConsumers();
	}

	private void initAllConsumers()
	{
		for(Integer i =0; i<this.THREADPOOL_CAPACITY;i++)
		{
			Thread thread = new Thread(new Worker(queue,i.toString()));
			thread.start();
		}
	}
	
	public void	submitTask(Runnable r) {
		queue.enqueue(r);		
	}
}
