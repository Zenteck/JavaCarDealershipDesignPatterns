import Behaviours.IDrive;

import java.util.ArrayList;

public class Customer {

    private double beerTokens;
    private ArrayList<Car> ownedCars;

    public Customer(double beerTokens){
        ownedCars = new ArrayList<>();
        this.beerTokens = beerTokens;
    }

    public double getBeerTokens() {
        return beerTokens;
    }

    public int countOwnedCars() {
        return ownedCars.size();
    }
}
