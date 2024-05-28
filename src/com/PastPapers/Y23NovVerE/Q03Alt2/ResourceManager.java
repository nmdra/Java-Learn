package PastPapers.Y23NovVerE.Q03Alt2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ResourceManager extends Thread{

	ArrayList<Resource> resourcepool ;
	HashMap<Integer, Resource> allocated;

	public ResourceManager(int resources) {

		this.resourcepool = new ArrayList<>();

		for(int i = 0 ; i < resources ;  i++) {
			resourcepool.add(new Resource(i));
		}
		this.allocated =  new HashMap<>();
	}

	public synchronized void requestResource(int userid) {

		while (resourcepool.isEmpty()) {
			System.out.println("User " + userid + " is waiting for a resource.");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		Resource resource = resourcepool.removeFirst(); // Removes the first available resource
		allocated.put(userid, resource);
		System.out.println("User " + userid + " acquires Resource " + resource.getRno());
		notifyAll();

	}

	public synchronized void releaseResource(int userid) {

		Iterator<Map.Entry<Integer, Resource>> iterator = allocated.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, Resource> entry = iterator.next();

			if(entry.getKey() == userid) {
				System.out.println("User "+ userid+" releases resource "+ entry.getValue() );
				resourcepool.add(entry.getValue());
				iterator.remove();
				notify();
			}
		}
	}
}
