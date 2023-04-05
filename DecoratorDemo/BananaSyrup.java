package FairWork.DecoratorDemo;

public class BananaSyrup implements IceCream {
    IceCream ic;
    BananaSyrup(IceCream ic){
        this.ic = ic;
    }

    public int getCost(){
        return 8 + ic.getCost();
    }

    public String getDescription(){
        return ic.getDescription() + " with banana syrup";
    }
}
