package com.thread;

public class Client {
	public static void main(String[] args) {
		Thread a = new Thread(new DeadLock(), "A");
		Thread b = new Thread(new DeadLock(), "B");
		
		
		
		a.start();
		b.start();
	}

}
