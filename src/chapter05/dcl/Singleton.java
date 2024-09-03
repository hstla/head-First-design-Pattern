package chapter05.dcl;

/**
 * 자바 5 이상 부터 volatile 키워드가 정상 동작함.
 * 자바 버전 이상이면 해당 키워드로 싱글톤 구현 추천
 */

public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
