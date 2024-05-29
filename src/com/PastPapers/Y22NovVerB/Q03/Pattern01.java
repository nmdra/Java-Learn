package PastPapers.Y22NovVerB.Q03;

public class Pattern01 implements Runnable {
	Object lock;
	String pattern;
	int count;

	public Pattern01(Object lock, String pattern, int count) {
		super();
		this.lock = lock;
		this.pattern = pattern;
		this.count = count;
	}

	@Override
	public void run() {
		synchronized (lock) {

			for(int i = 0; i < count; i++) {
				System.out.print("Pattern 01 Thread =  ");
				for(int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for(int k = 0; k < (count - i); k++ ) {
					System.out.print(pattern + " ");
				}

				System.out.println();
				try {
					Thread.sleep(1000);
					lock.notify();
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			lock.notifyAll();
		}
	}
}