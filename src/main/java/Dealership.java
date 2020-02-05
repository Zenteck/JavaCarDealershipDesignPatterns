import Behaviours.IDrive;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> electricCars;
    private ArrayList<Car> hybridCars;
    private ArrayList<Car> iceCars;
    private double till;


    public Dealership(double till){
      this.till = till;
      this.electricCars = new ArrayList<>();
      this.hybridCars = new ArrayList<>();
      this.iceCars = new ArrayList<>();
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void buyNewFactoryCar(String carType){
        CarFactory carFactory = CarFactory.getInstance();
        Car newCar = carFactory.getCar(carType);
        if(carType == "Electric"){
            electricCars.add(newCar);
            this.till -= newCar.getFactoryPrice();
        }
        if(carType == "Hybrid"){
            hybridCars.add(newCar);
            this.till -= newCar.getFactoryPrice();
        }
        if(carType == "ICECar"){
            iceCars.add(newCar);
            this.till -= newCar.getFactoryPrice();
        }
    }
}
