/*
#Classes and Objects in Java:

3. Define a class CARRENTAL with the following details:

Class Members are: Carld of int type, CarType of string type and Rent of float type.

Define GetCar() method which accepts Carld and CarType.

GetRent() method which return rent of the car on the basis of car type, i.e. Small Car 1000, Van800, SUV-2500

ShowCar() method which allow user to view the contents of cars i.e. id, type and rent.
 */

import java.util.*;

class CARRENTAL {

    int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
    }

    float GetRent() {

        if (CarType.equalsIgnoreCase("Small Car"))
            Rent = 1000;
        else if (CarType.equalsIgnoreCase("Van"))
            Rent = 800;
        else if (CarType.equalsIgnoreCase("SUV"))
            Rent = 2500;

        return Rent;
    }

    void ShowCar() {
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + GetRent());
    }

    public static void main(String[] args) {

        CARRENTAL c = new CARRENTAL();

        c.GetCar(101, "SUV");
        c.ShowCar();
    }
}