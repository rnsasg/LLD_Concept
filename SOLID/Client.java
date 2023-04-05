package FairWork.SOLID;

import FairWork.SOLID.Birds.*;
import FairWork.SOLID.Flyators.FastFlyator;
import FairWork.SOLID.Flyators.Flyator;
import FairWork.SOLID.Flyators.SlowFlyator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Flyator ff = new FastFlyator();
        Flyator sf = new SlowFlyator();

        Crow c = new Crow(ff);
        Pigeon p = new Pigeon(ff);
        Sparrow s = new Sparrow(sf);
        Peacock pc = new Peacock(sf);

        ArrayList<Flyable> list = new ArrayList<>();
        list.add(c);
        list.add(p);
        list.add(s);
        list.add(pc);
        makeBirdsFly(list);
    }

    static void makeBirdsFly(List<Flyable> list){
        for(Flyable fl: list){
            fl.fly();
        }
    }
}
