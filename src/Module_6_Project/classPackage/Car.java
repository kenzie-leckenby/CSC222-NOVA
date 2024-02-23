/**
 * Author: Kenzie Leckenby
 * Date: Feb 20, 2024
 * Description:
 */

package Module_6_Project.classPackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Car {
    private final String make;
    private final String model;
    private final int year;
    private final double tankSize;
    private final double fuelEconomy;
    private final double optimalSpeed;
    private double odometer;
    private double tripOdometer;
    private String color;
    private double fuelLevel;

    /**
     * @constructor creates a car object with random a randomly chosen make, model, color, and other attributes.
     */
    public Car() {
        String[] makes = {"Toyota", "Ford", "Chevrolet", "Honda", "Hyundai", "Kia", "Jeep", "Nissan", "Subaru"};
        String[][] models = {
                {"RAV4", "Prius", "Corolla", "Camry", "Sienna"}, // Toyota
                {"Explorer", "Fiesta", "Mustang", "Taurus", "Fusion"}, // Ford
                {"Equinox", "Silverado", "Suburban", "Camaro", "Malibu"}, // Chevrolet
                {"Accord", "Odyssey", "Civic", "Insight", "Fit"}, // Honda
                {"Kona", "Palisade", "Sonata", "Elantra", "Ioniq"}, // Hyundai
                {"Sportange", "Soul", "Stinger", "Sorento", "Niro"}, // Kia
                {"Wrangler", "Compass", "Cherokee", "Grand Cherokee", "Wagoneer"}, // Jeep
                {"Altima", "Sentra", "Versa", "Rogue", "Kicks"}, // Nissan
                {"Crosstrek", "Ascent", "Forester", "Outback", "Impreza"}}; // Subaru
        String[] colors = {"Red", "Blue", "Silver", "White", "Black"};

        Random rand = new Random();
        int randMake = rand.nextInt(10);
        int randModel = rand.nextInt(5);
        int randColor = rand.nextInt(5);
        int randYear = rand.nextInt(2000, 2025);
        double randTankSize = rand.nextDouble(8.0, 24.0);
        double randFuelEconomy = rand.nextDouble(15.0, 35.0);
        double randOptimalSpeed = rand.nextDouble(45.0, 80.0);
        double randOdometer = rand.nextDouble(0.0, 300001);
        double randTripOdometer = rand.nextDouble(0.0, randOdometer + 1.0);
        double randFuelLevel = rand.nextDouble(0.0, randTankSize + 1.0);

        this.make = makes[randMake];
        this.model = models[randMake][randModel];
        this.color = colors[randColor];
        this.year = randYear;
        this.tankSize = randTankSize;
        this.fuelEconomy = randFuelEconomy;
        this.optimalSpeed = randOptimalSpeed;
        this.odometer = randOdometer;
        this.tripOdometer = randTripOdometer;
        this.fuelLevel = randFuelLevel;
    }

    /**
     * @constructor creates a car with mostly user defined attributes.
     * @param make the brand, ex. Ford, Chevrolet
     * @param model models, ex. F-150, Silverado
     * @param color
     * @param year
     * @param tankSize tank size in gallons
     * @param fuelEconomy fuel economy at its best speed
     * @param optimalSpeed speed at which the car has the highest fuel economy
     */
    public Car(String make, String model, String color, int year, double tankSize, double fuelEconomy, double optimalSpeed) {
        Random rand = new Random();
        double randOdometer = rand.nextDouble(0.0, 6);
        double randFuelLevel = rand.nextDouble(0.0, tankSize + 1.0);

        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.tankSize = tankSize;
        this.fuelEconomy = fuelEconomy;
        this.optimalSpeed = optimalSpeed;
        this.odometer = randOdometer;
        this.tripOdometer = 0.0;
        this.fuelLevel = randFuelLevel;
    }

    /**
     * @param amount Amount of fuel to add in gallons
     * @return Positive double value for excess fuel. Zero for no excess/remaining fuel. Negative for tank space left for fuel.
     */
    public double addFuelToTank(double amount) {
        fuelLevel += amount;
        // For values that exceed the tankSize
        if (fuelLevel > tankSize + .1) {
            double excess = fuelLevel - tankSize;
            fuelLevel = tankSize;
            return excess;
        }
        // For values within a .1 range of the tankSize
        else if (fuelLevel >= tankSize - .1 || fuelLevel <= tankSize + .1) {
            fuelLevel = tankSize;
            return 0.0;
        }
        // Returns a negative value representative of fuel required to fill
        return fuelLevel - tankSize;
    }

    public String toString() {
        return
            String.format("Color: %s%n", color) +
            String.format("Year: %d%n", year) +
            String.format("Make: %s%n", make) +
            String.format("Model: %s%n", model) +
            String.format("Tank Size: %.1f%n", tankSize) +
            String.format("Fuel Economy: %.1f%n", fuelEconomy) +
            String.format("Optimal Speed: %.1f%n", optimalSpeed) +
            String.format("Odometer: %.1f%n", odometer) +
            String.format("Trip Odometer: %.1f%n", tripOdometer) +
            String.format("Fuel Level: %.1f%n", fuelLevel);
    }

    public boolean equals(Car comparedCar) {
        return comparedCar.year == this.year && comparedCar.make.equals(this.make) && comparedCar.model.equals(this.model);
    }

    public double getTripOdometer() {
        return BigDecimal.valueOf(tripOdometer).setScale(1, RoundingMode.HALF_UP).doubleValue();
    }

    public void clearTripOdometer() {
        tripOdometer = 0.0;
    }

    public double getOdometer() {
        return BigDecimal.valueOf(odometer).setScale(1, RoundingMode.HALF_UP).doubleValue();
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getTankSize() {
        return tankSize;
    }

    public void setUpTrip(double avgSpeed, double distance) {

    }
}
