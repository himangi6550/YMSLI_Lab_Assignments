package com.threads;

class Job implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=100;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
		
	}
	
}
public class MultiThread {
	public static void main(String[] args) {
		Job job=new Job();
		Thread thread1=new Thread(job,"A");
		Thread thread2=new Thread(job,"B");
		Thread thread3=new Thread(job,"C");
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
