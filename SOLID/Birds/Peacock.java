package FairWork.SOLID.Birds;

import FairWork.SOLID.Flyators.Flyator;

public class Peacock extends Bird implements Flyable {
    Flyator f;
    public Peacock(Flyator fobj){
        f = fobj;
    }

    @Override
    public void fly() {
        f.makeFly();
    }
}
