package FairWork.SOLID.Flyators;

public class SlowFlyator implements Flyator{
    @Override
    public void makeFly() {
        System.out.println("Make the bird fly slow");
    }
}
