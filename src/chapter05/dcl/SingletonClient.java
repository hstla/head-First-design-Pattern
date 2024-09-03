package chapter05.dcl;

public class SingletonClient {
	public static void main(String[] args) {
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
	}
}
