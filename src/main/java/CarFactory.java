import Components.Battery;
import Components.Engine;
import Components.PineTree;
import Components.Tyres;

public class CarFactory {

        private Engine engine = new Engine();
        private Tyres tyres = new Tyres();
        private PineTree pineTree = new PineTree();
        private Battery battery = new Battery();

    public Car getCar(String carType) {
        if (carType == null) {
            return null;
        }
        if (carType.equalsIgnoreCase("Hybrid")) {
            return new HybridCar(engine, tyres, pineTree, battery, 8.00);
        }
        if (carType.equalsIgnoreCase("Electric")) {
            return new ElectricCar(engine, tyres, pineTree, battery, 10.5);
        }
        if (carType.equalsIgnoreCase("ICECar")) {
            return new ICECar(engine, tyres, pineTree, 5.50);
        }
        return null;
    }
}
