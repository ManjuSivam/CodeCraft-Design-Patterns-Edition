package Structural.Decorator;
//only addon

public class MangoScoop implements Icecream{
    Icecream ic;
    int cost = 30;
    String desc = "Mango scoop";

    @Override
    public int getCost() {
        return ic.getCost()+this.cost;
    }

    @Override
    public String getDesc() {
        return ic.getDesc()+"+"+this.desc; // as addon
    }

    MangoScoop(Icecream ic){ //only copy cost; as it can be only add on
        this.ic=ic;
    }
}
