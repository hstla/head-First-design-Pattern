package chapter05.enumS;

// enum을 사용하면 동기화 상관없이 쉽게 구현할 수 있다.

public enum Singleton {
    UNIQUE_INSTANCE;

    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }
}


