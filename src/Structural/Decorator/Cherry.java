package Structural.Decorator;
//only addon

public class Cherry implements Icecream{
    Icecream ic;
    int cost = 5;
    String desc = "Cherry ";

    @Override
    public int getCost() {
        return ic.getCost()+this.cost;
    }

    @Override
    public String getDesc() {
        return ic.getDesc()+"+"+this.desc; // as addon
    }

    Cherry(Icecream ic){ //only copy cost; as it can be only add on
        this.ic=ic;
    }
}
