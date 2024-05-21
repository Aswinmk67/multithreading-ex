package demo_se_java;

class Sourceee extends Thread{
	public void addition1() {
		for(int i=0;i<=10;i++) {
			
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		
		for(int i=0;i<=10;i++) {
			
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
	}
}

public class multi_example {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				new Sourceee().start();
				
			}
		};
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				new Sourceee().start();
				
			}
		};
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
}
