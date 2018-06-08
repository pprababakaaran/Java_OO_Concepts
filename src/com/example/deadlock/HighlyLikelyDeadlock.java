package com.example.deadlock;



class Locker implements Runnable {

	String str1;
	String str2;
	
	public Locker(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (str1) {
				synchronized (str2) {
					System.out.println(Thread.currentThread().getName());
				}
			}
		}

	}

}

public class HighlyLikelyDeadlock {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Spring";
		
		Locker l1 = new Locker(str1, str2);
		Locker l2 = new Locker(str2, str1);

		Thread t1 = new Thread(l1, "Thread 1");
		Thread t2 = new Thread(l2, "Thread 2");
		t1.start();
		t2.start();
	}

}
