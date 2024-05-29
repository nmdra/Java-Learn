package PastPapers.Y19OctVerB.Q02;

public class AddNumbers implements Runnable{

	private final DemoThreads lock;
	private int no1;
	private int no2;

	public AddNumbers(DemoThreads lock, int no1, int no2) {
		super();
		this.lock = lock;
		this.no1 = no1;
		this.no2 = no2;
	}

	@Override
	public void run() {
		synchronized (lock) {
			for(int i= no1; i <= no2; i++) {
				try {
					Thread.sleep(500);
					lock.notify();
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+
						" => "+i+" (+) "+ i + " = "+(i+i));
			}
			lock.notifyAll();
		}
	}
}
