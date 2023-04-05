package FairWork.SOLID.Birds;

import FairWork.SOLID.Flyators.Flyator;

public class Sparrow extends Bird implements Flyable {
    Flyator f;
    public Sparrow(Flyator fobj){
        f = fobj;
    }

    @Override
    public void fly() {
        f.makeFly();
    }
}
