package com.thread;

public class DeadLock implements Runnable {
	
	private static String resourse = "";
	private static String resourse1 = "qw";

	public void run() {
		String t = Thread.currentThread().getName();
		
		if(t.equals("A")) {
			synchronized (resourse) {
				System.out.println(t + " 1st lock taken");
				sleep();
				synchronized (resourse1) {
					System.out.println(t + " 2nd lock taken");
				}
			}
		} else {
			synchronized (resourse1) {
				System.out.println(t + " 1st lock taken");
				sleep();
				synchronized (resourse) {
					System.out.println(t + " 2nd lock taken");
				}
			}
		}
		
	}
	
	private static void sleep(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}




