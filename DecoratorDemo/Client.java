package FairWork.DecoratorDemo;

public class Client {
    public static void main(String[] args) {
        // make an icecream
        // with choc cone, van scoop, choc chips, choc scoop, banana syrup, 2 cherries
        IceCream cc = new ChocolateCone();
        IceCream cc_vs = new VanillaScoopAddon(cc);
        IceCream cc_vs_cchp = new ChocChipsAddOn(cc_vs);
        IceCream cc_vs_cchp_cs = new ChocScoopAddon(cc_vs_cchp);
        IceCream cc_vs_cchp_cs_bs = new BananaSyrup(cc_vs_cchp_cs);
        IceCream cc_vs_cchp_cs_bs_cherry = new CherryAddon(cc_vs_cchp_cs_bs);
        IceCream cc_vs_cchp_cs_bs_cherry2 = new CherryAddon(cc_vs_cchp_cs_bs_cherry);
        System.out.println(cc_vs_cchp_cs_bs_cherry2.getCost());
        System.out.println(cc_vs_cchp_cs_bs_cherry2.getDescription());
    }
}
