package chapter06.remote;

public class GarageDoor {
    String garageDoor = "";

    public GarageDoor(String garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void open() {
        System.out.println("GarageDoor is open");
    }

    public void close() {
        System.out.println("GarageDoor is close");
    }

}
