package Structural.Decorator;

//base or add on
public class ChocolateCone implements Icecream{
    Icecream ic;
    int cost = 25;
    String desc = "Chocolate cone ";

    @Override
    public int getCost() {
        if(ic!=null)
        return ic.getCost()+this.cost;
        else return 0;
    }

    @Override
    public String getDesc() {
        if(ic.equals(null)) return this.desc;// as base
        else return ic.getDesc()+"+"+this.desc; // as addon
    }

    ChocolateCone(){//base

    }

    ChocolateCone(Icecream ic){
        this.ic=ic;
    }
}
