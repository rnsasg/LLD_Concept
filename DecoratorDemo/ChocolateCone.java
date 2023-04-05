package FairWork.DecoratorDemo;

public class ChocolateCone implements IceCream {
    @Override
    public int getCost() {
        return 12;
    }

    @Override
    public String getDescription() {
        return "Chocolate Cone";
    }
}
