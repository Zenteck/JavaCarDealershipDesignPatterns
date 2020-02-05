import Components.Battery;
import Components.Engine;
import Components.PineTree;
import Components.Tyres;

public class ElectricCar extends Car{

    private Battery battery;

    public ElectricCar(Engine engine, Tyres tyres, PineTree pineTree, Battery battery, double factoryPrice){
        super(engine, tyres, pineTree, factoryPrice);
        this.battery = battery;

    }




}
