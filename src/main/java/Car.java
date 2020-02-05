import Components.Engine;
import Behaviours.IDrive;
import Components.PineTree;
import Components.Tyres;

public abstract class Car implements IDrive {

    private Engine engine;
    private Tyres tyres;
    private PineTree pinetree;
    private double factoryPrice;

    public Car(Engine engine, Tyres tyres, PineTree pineTree, double factoryPrice){
        this.engine = engine;
        this.tyres = tyres;
        this.pinetree = pineTree;
        this.factoryPrice = factoryPrice;
    }

    public String drive(){
        return "Beepboop car has started";
    }

    public double getFactoryPrice() {
        return factoryPrice;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public PineTree getPinetree() {
        return pinetree;
    }

}
