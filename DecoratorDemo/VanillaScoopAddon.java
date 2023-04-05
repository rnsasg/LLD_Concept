package FairWork.DecoratorDemo;

public class VanillaScoopAddon implements IceCream {
    IceCream ic;
    VanillaScoopAddon(IceCream ic){
        this.ic = ic;
    }

    public int getCost(){
        return 5 + ic.getCost();
    }

    public String getDescription(){
        return ic.getDescription() + " with vanilla scoop";
    }
}
