package HomeWork6;

public class Competition {
    public static void main(String[] args) {

    String eventWin = " удалось";
    String eventLoss = " не удалось";
    String eventName;
    String eventResult;

    Cat cat1 = new Cat("Кошка", "Кошка1", 200, 0);
    Dog dog1 = new Dog("Собака", "Собака1", 500, 10);
    Cat cat2 = new Cat("Кошка", "Кошка2", 222, 0);
    Dog dog2= new Dog("Собака", "Собака2", 555, 5);

        Pets[] pet = {cat1, cat2, dog1, dog2};

    float runLength = 300;
    float swimLength = 6;

    for (int i = 0; i < pet.length; i++) {
        String nameString = pet[i].getType() + " " + pet[i].getName() + " может ";

        eventName = "пробежать " + pet[i].getMaxRunDistance() + " м. Пробежать ";
        eventResult = pet[i].run(runLength) ? eventWin : eventLoss;
        result(nameString, eventName, runLength, eventResult);

        int swimResult = pet[i].swim(swimLength);
        eventName = "проплыть на " + pet[i].getMaxSwimDistance() + " м. Проплыть ";
        eventResult = (swimResult == Pets.SWIM_OK) ? eventWin : eventLoss;

        if (swimResult == Pets.SWIM_NONE)
            eventResult = " не удалось, т.к. не умеет плавать";
        result(nameString, eventName, swimLength, eventResult);
    }

    System.out.println("All animals = " + Pets.countAnimal + " | Cats = " + Cat.countCat + " | Dogs = " + Dog.countDog);
}

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + " м" + resultEvent);
    }
}
