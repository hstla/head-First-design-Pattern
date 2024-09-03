package chapter05.enumChocolate;

public class ChocolateController {
    public static void main(String args[]) {
        ChocolateSingleton boiler = ChocolateSingleton.INSTANCE;
        boiler.fill();
        boiler.boil();
        boiler.drain();
    }
}
