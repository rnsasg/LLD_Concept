package FairWork.DecoratorDemo;

public class MangoCone implements IceCream {
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Mango Cone";
    }
}
