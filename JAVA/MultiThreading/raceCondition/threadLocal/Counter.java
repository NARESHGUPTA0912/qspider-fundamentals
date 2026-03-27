package MultiThreading.raceCondition.threadLocal;

public class Counter {
    private final ThreadLocal<Integer> count=ThreadLocal.withInitial(()->0);
	
	public void increment() {
		count.set(count.get()+1);
	}
	
	public int getValue() {
	return count.get();
	}
	
	public void clear() {
		count.remove();
	}
}
