package demo_se_java;

import java.util.Iterator;

class Resouece{
	public void res1() {
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				System.out.println(i);
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			
			}
		}
	}
	
	public void res2(){
		for(int i=11;i<=20;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Sample1 extends Thread{
	Resouece r1;
	Sample1(Resouece r1){
		this.r1 = r1;
	}
	public void run() {
		r1.res1();
	}
}

class Sample2 implements Runnable{
	Resouece r2;
	Sample2(Resouece r2){
		this.r2=r2;
	}
	public void run() {
		r2.res2();
	}
}

public class Multi_Exmpl2 {

	public static void main(String[] args) {
		Resouece r = new Resouece();
		long startTime = System.currentTimeMillis();
		Thread t1 = new Thread(new Sample1(r));
		Thread t2 = new Thread(new Sample2(r));
		t1.start();
		t2.start();
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}

}
