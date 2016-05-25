package yangyi.tij.Thread;

import java.util.Date;

class MyThread extends Thread{
	private boolean flag=true;
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() {
//		System.out.println(Thread.currentThread().isAlive());
//		while(flag){
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(new Date()+"");
//		}
		for(int i=0;i<=100;i++){
			System.out.println(getName()+":"+i);
			if(i%10==0){
				yield();
			}
			
		}
	}
	public void changeFlag(){
		flag=false;
		System.out.println(Thread.currentThread().isAlive());
	}
}
public class ThreadTest {

	public static void main(String[] args) {
		MyThread thread1=new MyThread("thread1");
		MyThread thread2=new MyThread("thread2");
//		thread1.setPriority(9);
		thread1.start();
		thread2.start();
//		try {
//			thread1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		for(int i=0;i<1000;i++){
//			System.out.println("我是主线程");
//		}
//		a.start();
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		a.changeFlag();
	}
}
