package MultiThreading.raceCondition.lockPrograms;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private volatile int count=0;
	private final Lock l=new ReentrantLock();

	public void increment() {
		
		l.lock();
		try {
			count++;
			
		}finally {
			l.unlock();
		}	
	}
	
	public int getCount() {
		return count;
	}
}
