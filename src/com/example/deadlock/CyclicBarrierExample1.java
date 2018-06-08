package com.example.deadlock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Service1 implements Runnable {

	private final String name;
	private final int timeToStart;
    private CyclicBarrier barrier;

	public Service1(String name, int timeToStart, CyclicBarrier barrier) {
		this.name = name;
		this.timeToStart = timeToStart;
		this.barrier = barrier;
	}

    @Override
    public void run() {
        try {
        	Thread.sleep(timeToStart);
        } catch (InterruptedException ex) {
        	System.out.println(ex);
        }
        
        System.out.println(name + " is Up");
		System.out.println("Count: "+barrier.getNumberWaiting());

    }
}
public class CyclicBarrierExample1 {
	
	public static void main(String args[]) {

		// creating CyclicBarrier with 3 parties i.e. 3 Threads needs to call
		// await()
		final CyclicBarrier cb = new CyclicBarrier(3,new Runnable(){
            @Override
            public void run(){
                //This task will be executed once all thread reaches barrier
    			System.out.println("All services are up, Application is starting now");
            }
        });

		// starting each of thread
		Thread cacheService = new Thread(new Service1("Cache Service",1000,cb), "Thread 1");
		Thread alertService = new Thread(new Service1("Alert Service",1000,cb),"Thread 2" );
		Thread validationService = new Thread(new Service1("Validation Service",1000,cb), "Thread 3");

		cacheService.start();
		alertService.start();
		validationService.start();
		
		try {
			cb.await();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
