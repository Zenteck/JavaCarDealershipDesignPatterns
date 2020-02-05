import Components.Battery;
import Components.Engine;
import Components.PineTree;
import Components.Tyres;

public class HybridCar extends Car{

        private Battery battery;

        public HybridCar(Engine engine, Tyres tyres, PineTree pineTree, Battery battery, double factoryPrice) {
            super(engine, tyres, pineTree, factoryPrice);
            this.battery = battery;
        }
}
