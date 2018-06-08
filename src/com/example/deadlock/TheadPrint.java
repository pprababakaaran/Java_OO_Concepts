package com.example.deadlock;


class CustomThread implements Runnable
{
	Object lock;
	
	public CustomThread(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		while(TheadPrint.val<=10)
		{
			if(TheadPrint.val%2==0)
			{
				synchronized (lock) {
					System.out.println("Even "+TheadPrint.val);
					TheadPrint.val++;
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			if(TheadPrint.val%2==1)
			{
				synchronized (lock) {
					System.out.println("Odd "+TheadPrint.val);
					TheadPrint.val++;
					lock.notify();
				}
			}
			
		}
	}
	
}


public class TheadPrint {
	volatile static int val = 1;

	public static void main(String[] args) {
		Object lock = new Object();
		CustomThread T_1 = new CustomThread(lock);
		CustomThread T_2 = new CustomThread(lock);
		Thread t1 = new Thread(T_1);
		Thread t2 = new Thread(T_2);
		t1.start();
		t2.start();

	}

}
