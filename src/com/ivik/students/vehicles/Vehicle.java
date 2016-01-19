package com.ivik.students.vehicles;

/**
 * Created by Christian on 16-1-2016.
 */
public class Vehicle {

    public Vehicle[] vehicles = {};

    private static String initVehicles;
    {
        vehicles[0] = new Car();
        vehicles[1] = new Subaru();
        vehicles[2] = new Car();
    }

    /**
     * Created by Christian on 16-1-2016.
     */
    public static class Subaru extends Car {
        Vehicle v2 = new Subaru();
    }

    /**
     * Created by Christian on 16-1-2016.
     */
    public static class Car extends Vehicle {
        Vehicle v1 = new Car();
        Vehicle v3 = new Car();
    }
}
