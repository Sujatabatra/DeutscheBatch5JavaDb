package com.sujata.demo;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class ThreadTask implements Runnable {

	private String taskName;

	public ThreadTask(String taskName) {
		super();
		this.taskName = taskName;
	}

	@Override
	public void run() {
		System.out.println("Hi "+taskName+" is executed by "+Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000); //thread goes in waiting state
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(taskName+" is executed after waking up by "+Thread.currentThread().getName());
	}

}

public class ThreadPoolExecutorDemo {

	public static void main(String[] args) {

		Executor fixedThreadPool = Executors.newFixedThreadPool(3);

		for(int taskCount=1;taskCount<=8;taskCount++) {
			ThreadTask t=new ThreadTask("Task "+taskCount);
			fixedThreadPool.execute(t);
		}
	}

}
