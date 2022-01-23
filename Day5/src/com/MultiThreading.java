package com.threads;

import java.util.Random;

class JobOfSum implements Runnable{
	Random random = new Random();
	private int sum;

	public int getSum() {
		return sum;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
			int randomNumber=random.nextInt(10) + 1;
			System.out.println(Thread.currentThread().getName()+" : "+randomNumber);
			Object lock = new Object();
			synchronized(lock){
				sum+=randomNumber;
			}
				
	}
	
}
public class MultiThreading {
	public static void main(String[] args) {
		JobOfSum job=new JobOfSum();
		Thread thread1=new Thread(job,"A");
		Thread thread2=new Thread(job,"B");
		Thread thread3=new Thread(job,"C");
		Thread thread4=new Thread(job,"D");
		Thread thread5=new Thread(job,"E");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(job.getSum());
	}

}
