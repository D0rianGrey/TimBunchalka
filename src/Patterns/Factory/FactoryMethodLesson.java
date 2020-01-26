// Метод который создаем сам себя

package Patterns.Factory;

public class FactoryMethodLesson {
    public static void main(String[] args) {
        Person person = Person.create();

    }
}

class Person {
    private Person() {

    }

    static Person create() {
        return new Person();
    }
}
