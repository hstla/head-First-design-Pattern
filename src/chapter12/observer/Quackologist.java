package chapter12.observer;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("꽤꽥학자: " + duck + " 가 방금 소리냈다.");
    }

    public String toString() {
        return "Quackologist";
    }
}
