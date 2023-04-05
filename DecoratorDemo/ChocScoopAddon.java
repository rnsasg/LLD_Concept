package FairWork.DecoratorDemo;

public class ChocScoopAddon implements IceCream {
    IceCream ic;
    ChocScoopAddon(IceCream ic){
        this.ic = ic;
    }

    public int getCost(){
        return 7 + ic.getCost();
    }

    public String getDescription(){
        return ic.getDescription() + " with choclate scoop";
    }
}
