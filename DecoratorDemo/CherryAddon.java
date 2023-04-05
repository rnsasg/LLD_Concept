package FairWork.DecoratorDemo;

public class CherryAddon implements IceCream {
    IceCream ic;
    CherryAddon(IceCream ic){
        this.ic = ic;
    }

    public int getCost(){
        return 2 + ic.getCost();
    }

    public String getDescription(){
        return ic.getDescription() + " with cherry";
    }
}
