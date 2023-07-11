package com.commons.model;

import java.util.List;
import java.util.Objects;

public class GasStation {
    private double _quantity;
    private double _price;

    //Constructor_simple
    public GasStation() {
    }

    //Constructor_full
    public GasStation(double quantity, double price) {
        this._quantity = quantity;
        this._price = price;
    }

    public double get_quantity() {
        return _quantity;
    }

    public void set_quantity(double _quantity) {
        this._quantity = _quantity;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GasStation that = (GasStation) o;
        return Double.compare(that._quantity, _quantity) == 0 && Double.compare(that._price, _price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(_quantity, _price);
    }

    @Override
    public String toString() {
        return "gasStation{" +
                "quantity=" + _quantity +
                ", price=" + _price +
                '}';
    }

    /**
     * We want to know the exact value (in money) of the current quantity of fuel inside the car's tank.
     */
    public double restOfFuelInsideTheTank(double fuelQuantityOfCar, List<GasStation> gasStationList) {
        double restFuelInsideTheTank = 0.0;

        for (GasStation gas : gasStationList) {
            double minQuantity = Math.min(fuelQuantityOfCar, gas.get_quantity());
            double value = minQuantity * gas.get_price();

            restFuelInsideTheTank = restFuelInsideTheTank + value;
        }
        return restFuelInsideTheTank;
    }
}
