package chapter05.stat;

/**
 * 미리 인스턴스를 선언하여 멀티쓰레드에서 동기화 문제 차단.
 */

public class Singleton {
	private static Singleton uniqueInstance = new Singleton();
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		return uniqueInstance;
	}
	
	// other useful methods here
	public String getDescription() {
		return "I'm a statically initialized Singleton!";
	}
}
