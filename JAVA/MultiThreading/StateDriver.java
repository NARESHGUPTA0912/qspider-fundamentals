package MultiThreading;

import java.lang.Thread.State;
import java.lang.reflect.Method;

public class StateDriver {
    public static void main(String[] args) {
		System.out.println("ALl Thread states are: ");
		
		System.out.println(Thread.currentThread().getName());
		
		
		
		State[] s=Thread.State.values();
		for(State x:s) {
			System.out.println(x);
		}
		System.out.println("======================");
		
		Employ e=new Employ();
		Method[] m=e.getClass().getMethods();
		for(Method p:m)
			System.out.println(p.getName()+"   :\t"+p.getReturnType());
	}
}
