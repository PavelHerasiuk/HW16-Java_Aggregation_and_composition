package by.epam.car.main;
// 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
//    Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi");
        System.out.printf("We created a car %s. Trying to drive:%n", audi.getModelName());
        audi.run();

        Engine engine = new Engine(150, 2.981); // 150 - мощность в л.с.
        audi.setEngine(engine);
        System.out.printf("%nA %d hp engine is installed. A volume of %.3f liters. Trying to drive:%n",
                engine.getPower(), engine.getVolume());
        audi.run();

        int wheelDiameter = 19;
        audi.setWheels(new Wheel(wheelDiameter), new Wheel(wheelDiameter), new Wheel(wheelDiameter), new Wheel(wheelDiameter));
        System.out.printf("%nWheels are installed. Trying to drive:\n");
        audi.run();

        audi.getWheels().get(2).breakWheel();
        System.out.println("\nSTOP! Something broke.\nTrying to drive:");
        audi.run();

        audi.changeWheel();
        System.out.println("\nTrying to drive:");
        audi.run();

        System.out.println("...");
        audi.setFuel(false);
        audi.run();
        audi.refuel();
        audi.run();

        System.out.println("\nCar model: " + audi.getModelName());
    }
}