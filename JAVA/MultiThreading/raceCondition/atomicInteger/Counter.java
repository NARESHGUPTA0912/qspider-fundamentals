package MultiThreading.raceCondition.atomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private volatile AtomicInteger count=new AtomicInteger(0);
	
	public void increment() {
		
			count.getAndIncrement();
	}
	
	public int getCount() {
		return count.get();
	}

}
