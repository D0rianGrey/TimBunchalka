// Обьект в одном экземляре

package Patterns.Singelton;

public class SingeltonLesson {
    public static void main(String[] args) {

        Singelton singelton = Singelton.getSingelton();
        Singelton singelton2 = Singelton.getSingelton();
        singelton.i = 5;
        System.out.println(singelton2.i);

    }

}

class Singelton {
    int i = 0;
    static Singelton singelton = new Singelton();

    private Singelton() {
    }

    public static Singelton getSingelton() {
        return singelton;
    }
}
