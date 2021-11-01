package lab8;

import java.time.LocalTime;

public class RefreshTime implements Runnable{

	@Override
	public void run() {
		System.out.println("Current time is::");
		for(int i=0;i<10;i++) {
			System.out.println(LocalTime.now());
			try {
				Thread.sleep(10000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("TimesAfter 10 sec is::");
		}
	}
	

}
