package com.upskill.java_6;

public class MultithreadingThread {
	
	public void run() {
		
		try {
		System.out.println("Thread Number #" + Thread.currentThread()+ "Is Running");
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
