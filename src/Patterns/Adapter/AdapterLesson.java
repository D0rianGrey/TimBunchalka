//Деланье из одного интерфейса в другой

package Patterns.Adapter;

public class AdapterLesson {
    public static void main(String[] args) {
        CarWash carWash = new CarWash();
        carWash.washCar(new TrackWrapper(new MyTrack()));
    }
}

class TrackWrapper implements Car {
    Track track;

    public TrackWrapper(Track track) {
        this.track = track;
    }

    @Override
    public void wash() {
        track.clean();
    }
}

interface Track {
    void clean();
}

class MyTrack implements Track {
    @Override
    public void clean() {
        System.out.println("Track is cleaned");
    }
}

interface Car {
    void wash();
}

class Audi implements Car {
    @Override
    public void wash() {
        System.out.println("Wash car");
    }
}

class CarWash {
    public void washCar(Car car) {
        car.wash();
    }
}

