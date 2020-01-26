//Фабрика фабрик

package Patterns.Factory;

public class AbstractFactoryLesson {
    public static void main(String[] args) {
        Factory carFactory = new AbstractFactory().createFactory("Car");
        Factory tankFactory = new AbstractFactory().createFactory("Tank");
        Car toyota = carFactory.createCar("Toyota");
        toyota.drive();
        Tank t34 = tankFactory.createTank("T34");
        t34.drive();
    }

}

//Создаем абстрактную фабрику, которая будет создавать другие фабрики
interface Factory {
    Car createCar(String typeOfCar);

    Tank createTank(String typeOfTank);
}

//Создаем класс, метод которого будет создавать определенный фабрики в зависимости от параметра
class AbstractFactory {
    Factory createFactory(String typeOfFactory) {
        return switch (typeOfFactory) {
            case "Car" -> new CarFactory();
            case "Tank" -> new TankFactory();
            default -> null;
        };
    }
}

//Создаем фабрику по созданию МАШИН переопределяя метод createCar из interface Factory
class CarFactory implements Factory {
    public Car createCar(String typeOfCar) {
        return switch (typeOfCar) {
            case "Toyota" -> new Toyota();
            case "Audi" -> new Audi();
            default -> null;
        };
    }

    @Override
    public Tank createTank(String typeOfTank) {
        return null;
    }
}

//Создаем фабрику по созданию ТАНКОВ переопределяя метод createTank из interface Factory
class TankFactory implements Factory {

    public Tank createTank(String typeOfCar) {
        return switch (typeOfCar) {
            case "T34" -> new T34();
            case "T31" -> new T31();
            default -> null;
        };
    }

    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }
}

// Создаем обобщенный интерфейс для создания определенных МАШИН в будущем
interface Car {
    void drive();
}

//Создаем определенную машину и реализуем абстрактный метод из interface Car
class Toyota implements Car {

    @Override
    public void drive() {
        System.out.println("Drive Toyota");
    }
}

//Создаем определенную машину и реализуем абстрактный метод из interface Car
class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("Drive Audi");
    }
}

// Создаем обобщенный интерфейс для создания определенных ТАНКОВ в будущем
interface Tank {
    void drive();
}

//Создаем определенный ТАНК и реализуем абстрактный метод из interface Tank
class T34 implements Tank {

    @Override
    public void drive() {
        System.out.println("Drive T34");
    }
}

//Создаем определенный ТАНК и реализуем абстрактный метод из interface Tank
class T31 implements Tank {
    @Override
    public void drive() {
        System.out.println("Drive T31");
    }
}



