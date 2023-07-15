package day5;
public class ThreadA extends Thread{

	public void run() {
		for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1 executing...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
}


