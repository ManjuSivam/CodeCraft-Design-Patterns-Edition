package Structural.Decorator;
//only addon

public class ChocolateSyrup implements Icecream{
    Icecream ic;
    int cost = 30;
    String desc = "Chocolate Syrup ";

    @Override
    public int getCost() {
        return ic.getCost()+this.cost;
    }

    @Override
    public String getDesc() {
        return ic.getDesc()+"+"+this.desc; // as addon
    }

    ChocolateSyrup(Icecream ic){ //only copy cost; as it can be only add on
        this.ic=ic;
    }
}
