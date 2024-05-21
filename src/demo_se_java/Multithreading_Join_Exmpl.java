package demo_se_java;

import java.security.PublicKey;

public class Multithreading_Join_Exmpl {
	
	public static int counter1 = 0;
	public static int counter2 = 0;
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		Thread t1 = new Thread() {
			public void run() {
				for(int i=1;i<=5;i++) {
					counter1++;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(counter1);
				}
			}
		};
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i=1;i<=5;i++) {
					counter2++;
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(counter1);
				}
			}
		};
		t2.start();
		
		Thread t3 = new Thread() {
			public void run() {
				try {
					t1.join();
					t2.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t3.start();
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		System.out.println(counter1+" "+counter2);
	}
}
