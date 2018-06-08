package com.example.threadsample;


class Table {
	public synchronized void printTable(int n) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Value is " + (n * i));
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 extends Thread {
	Table t;

	MyThread1(Table t){
		this.t = t;
	}
	
	public void run() {
		System.out.println("Inside MyThread1 Run");
		t.printTable(5);
	}
}

class MyThread2 extends Thread {
	Table t;

	MyThread2(Table t){
		this.t = t;
	}
	
	public void run() {
		System.out.println("Inside MyThread2 Run");
		t.printTable(100);
		try {
			throw new Exception("test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class ThreadSample {

	public static void main(String[] args) {

		Table tab = new Table();
		MyThread1 t1 = new MyThread1(tab);
		MyThread2 t2 = null;
		try{
		t2 = new MyThread2(tab);
		} catch(Exception e){
			System.out.println("Inside");
		}
		t1.start();
		t2.start();
	}

}
