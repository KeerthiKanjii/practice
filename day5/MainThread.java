package day5;
public class MainThread {

	public static void main(String[] args) {
		
	ThreadA t1 = new ThreadA();
	ThreadB t2 = new ThreadB();
	
	t1.setPriority(Thread.MAX_PRIORITY);
    t2.setPriority(Thread.MIN_PRIORITY);

    t1.start();
    t2.start();
	}
	
}

