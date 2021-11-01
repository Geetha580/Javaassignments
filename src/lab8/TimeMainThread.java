package lab8;

public class TimeMainThread {
	public static void main(String[] args) {
		RefreshTime time=new RefreshTime();
		Thread t=new Thread(time);
		t.start();
	}

}
