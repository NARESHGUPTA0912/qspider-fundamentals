package MultiThreading.raceCondition;

public class Counter {
    private volatile int count;
	
	public void increment() {
		//code
		synchronized (Counter.class) {
			count++;
		}
		
		//100 lines of code
	}
	
	public int getCount() {
		return count;
	}
}
