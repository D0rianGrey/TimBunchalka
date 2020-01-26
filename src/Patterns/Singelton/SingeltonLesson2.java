package Patterns.Singelton;

import org.w3c.dom.ls.LSOutput;

public class SingeltonLesson2 {
    public static void main(String[] args) {
        SingeltonLesson2 singeltonLesson2 = SingeltonLesson2.getInstance();
        System.out.println(singeltonLesson2.x);
        singeltonLesson2.x = 20;
        System.out.println(singeltonLesson2.x);
        SingeltonLesson2 singeltonLesson2test = SingeltonLesson2.getInstance();
        System.out.println(singeltonLesson2test.x);


    }

    public int x;
    private static SingeltonLesson2 object;

    private SingeltonLesson2() {
        this.x = 10;
    }

    public static SingeltonLesson2 getInstance() {
        if (object == null)
            object = new SingeltonLesson2();
        return object;
    }
}

