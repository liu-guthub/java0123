package suitang_0127;

public class Thread1 implements Runnable {
	int num=20;
	Object lock=new Object();
	public synchronized void run(){
		while(num>0){
				System.out.println(Thread.currentThread().getName()+"етЪЧ"+num);
				num--;
//				try {
//					Thread.currentThread().sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
		}	
	}
}
