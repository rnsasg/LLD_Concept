package FairWork.DecoratorDemo;

public class ChocChipsAddOn implements IceCream {
    IceCream ic;
    ChocChipsAddOn(IceCream ic){
        this.ic = ic;
    }

    public int getCost(){
        return 3 + ic.getCost();
    }

    public String getDescription(){
        return ic.getDescription() + " with chocalte chips";
    }
}
