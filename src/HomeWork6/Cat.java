package HomeWork6;

public class Cat extends Pets {

    public static int countCat = 0;

    Cat(String type, String name, float maxRunDistance, float maxSwimDistance) {
        super(type, name, maxRunDistance, maxSwimDistance);
        ++countCat;
    }

    @Override
    protected int swim(float distance) {
        return Pets.SWIM_NONE;
    }

}
