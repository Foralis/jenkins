package org.example.tmp.fabric_method;

public class App {
    public static void main(String[] args) {
        Mechanic carMechanic = new CarDeliveryMechanic();
        Mechanic shipMechanic = new ShipDeliveryMechanic();

        carMechanic.inform();
        shipMechanic.inform();
    }
}
