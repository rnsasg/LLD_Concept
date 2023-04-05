package FairWork.SOLID.Birds;

import FairWork.SOLID.Flyators.Flyator;

public class Crow extends Bird implements Flyable {
    Flyator f;
    public Crow(Flyator fobj){
        f = fobj;
    }

    @Override
    public void fly() {
        f.makeFly();
    }
}
