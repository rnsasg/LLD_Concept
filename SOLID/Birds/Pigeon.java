package FairWork.SOLID.Birds;

import FairWork.SOLID.Flyators.Flyator;

public class Pigeon extends Bird implements Flyable {
    Flyator f;
    public Pigeon(Flyator fobj){
        f = fobj;
    }

    @Override
    public void fly() {
        f.makeFly();
    }
}
