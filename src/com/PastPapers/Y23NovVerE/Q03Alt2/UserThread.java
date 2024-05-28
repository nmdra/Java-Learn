package PastPapers.Y23NovVerE.Q03Alt2;

public class UserThread extends Thread{
	
	private int userid ;
	ResourceManager  rm ;
	
	public UserThread(int userid, ResourceManager rm) {
		this.userid = userid;
		this.rm = rm;
	}
	
	public void run() {
		rm.requestResource(userid);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		rm.releaseResource(userid);
	}
}
