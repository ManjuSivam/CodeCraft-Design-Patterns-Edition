package Structural.Decorator;
//only addon

import Structural.Decorator.Icecream;

public class ChocolateScoop implements Icecream {
    Icecream ic;
    int cost = 30;
    String desc = "Chocolate scoop ";

    @Override
    public int getCost() {
        return ic.getCost()+this.cost;
    }

    @Override
    public String getDesc() {
        return ic.getDesc()+"+"+this.desc; // as addon
    }

    ChocolateScoop(Icecream ic){ //only copy cost; as it can be only add on
        this.ic=ic;
    }
}
