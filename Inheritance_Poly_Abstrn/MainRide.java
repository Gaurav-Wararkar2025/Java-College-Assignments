/*

# Inheritance,Polymorphism and Abstraction in Java:

15. A ride booking application supports different types of rides. Each ride calculates fare differently.

Question:

Create an abstract class Ride with:

distance

abstract method calculateFare()

Create subclasses:

BikeRide fare = rupees 5 per km

AutoRide fare = rupees 8 per km

CarRide fare = rupees 12 per km

Store different rides in a Ride array and calculate fares using runtime polymorphism.

*/

abstract class Ride {

    double distance;

    Ride(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();
}

class BikeRide extends Ride {

    BikeRide(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 5;
    }
}

class AutoRide extends Ride {

    AutoRide(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 8;
    }
}

class CarRide extends Ride {

    CarRide(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 12;
    }
}

class MainRide {
    public static void main(String[] args) {

        Ride[] rides = new Ride[3];

        rides[0] = new BikeRide(10);
        rides[1] = new AutoRide(10);
        rides[2] = new CarRide(10);

        for (Ride r : rides) {
            System.out.println("Fare: " + r.calculateFare());
        }
    }
}