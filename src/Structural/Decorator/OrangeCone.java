package Structural.Decorator;

//only as base
public class OrangeCone implements Icecream{
    Icecream ic;
    int cost = 20;
    String desc = "Orange cone ";

    @Override
    public int getCost() {
        return this.cost;//only as base
    }

    @Override
    public String getDesc() {
        return this.desc;//only as base
    }


}
