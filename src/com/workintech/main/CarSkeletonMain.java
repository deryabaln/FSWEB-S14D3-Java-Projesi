package com.workintech.main;

import com.workintech.carSkeleton.CarSkeleton;
import com.workintech.carSkeleton.ElectricCar;
import com.workintech.carSkeleton.GasPoweredCar;

public class CarSkeletonMain {
    public static void main(String[] args) {
        CarSkeleton car1 = new ElectricCar("Tesla", "Tesla aracıdır", 100, 10);
        CarSkeleton car2 = new GasPoweredCar("Mercedes", "c180", 0.08, 4);
        car1.drive();
        car2.drive();
    }
}
