package HomeWork6;

public class Dog extends Pets{
    public static int countDog = 0;

    Dog(String type, String name, float maxRunDistance, float maxSwimDistance) {
        super(type, name, maxRunDistance, maxSwimDistance);
        ++countDog;
    }
}
