package com.example.deadlock;

class Thread1 implements Runnable
{

	@Override
	public void run() {
		while(true){
            synchronized(DeadLockTest.str1){
                synchronized(DeadLockTest.str2){
                    System.out.println(DeadLockTest.str1 + DeadLockTest.str2);
                }
            }
        }
		
	}
}

class Thread2 implements Runnable
{

	@Override
	public void run() {
		while(true){
            synchronized(DeadLockTest.str2){
                synchronized(DeadLockTest.str1){
                    System.out.println(DeadLockTest.str2 + DeadLockTest.str1);
                }
            }
        }
		
	}
	
}

public class DeadLockTest {

	public static String str1 = "Java";
	public static String str2 = "Spring";
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Thread t1 = new Thread(new Thread1(), "Thread 1");
	Thread t2 = new Thread(new Thread2(), "Thread 2");
	t1.start();
	t2.start();
	}

}
