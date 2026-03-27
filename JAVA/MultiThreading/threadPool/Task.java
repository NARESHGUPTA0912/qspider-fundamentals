package MultiThreading.threadPool;

public class Task extends Thread{
	String name;
	
	Task(String name){
		this.name=name;
	}
        @Override
	public void run() {
		System.out.println(name+" task is being completed by: "
				+Thread.currentThread().getName());
	}
}
