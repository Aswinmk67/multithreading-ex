package demo_se_java;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread extends Thread{
	private String name;
	
	public SomeThread(String name) {
		super(name);
		this.name = name;
	}
	
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The current thread is "+ name);
	}
}

public class Thread_Pool {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(8);
		
		SomeThread s1 = new SomeThread("s1");
		SomeThread s2 = new SomeThread("s2");
		SomeThread s3 = new SomeThread("s3");
		SomeThread s4 = new SomeThread("s4");
		SomeThread s5 = new SomeThread("s5");
		SomeThread s6 = new SomeThread("s6");
		SomeThread s7 = new SomeThread("s7");
		SomeThread s8 = new SomeThread("s8");
		
		executorService.execute(s1);
		executorService.execute(s2);
		executorService.execute(s3);
		executorService.execute(s4);
		executorService.execute(s5);
		executorService.execute(s6);
		executorService.execute(s7);
		executorService.execute(s8);
		
		executorService.shutdown();
	}

}
