package Bunchalka.Section_6_OOP_Part_1_Classes_Constructors_and_Inheritance.Lesson_77_Classes_Part_2;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
