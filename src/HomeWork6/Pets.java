package HomeWork6;

public class Pets {
    static final int SWIM_FAIL = 0;
    static final int SWIM_OK = 1;
    static final int SWIM_NONE = -1;

    private String type;
    protected String name;
    private float maxRunDistance;
    private float maxSwimDistance;

    public static int countAnimal = 0;

    Pets(String type, String name, float maxRunDistance, float maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        ++countAnimal;
    }

    String getType() {
        return this.type;
    }

    String getName() {
        return this.name;
    }

    float getMaxRunDistance() {
        return this.maxRunDistance;
    }

    float getMaxSwimDistance() {
        return this.maxSwimDistance;
    }

    protected boolean run(float distance) {
        return (distance <= maxRunDistance);
    }

    protected int swim(float distance) {
        return (distance <= maxSwimDistance) ? SWIM_OK : SWIM_FAIL;
    }
}
//