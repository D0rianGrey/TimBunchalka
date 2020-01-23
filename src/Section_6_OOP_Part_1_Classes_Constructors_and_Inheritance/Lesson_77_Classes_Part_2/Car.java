package Section_6_OOP_Part_1_Classes_Constructors_and_Inheritance.Lesson_77_Classes_Part_2;

/**
 * Created by dev on 8/3/15.
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
