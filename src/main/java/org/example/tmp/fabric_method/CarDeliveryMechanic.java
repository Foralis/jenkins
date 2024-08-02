package org.example.tmp.fabric_method;

public class CarDeliveryMechanic extends Mechanic{
    @Override
    Transport createTransport() {
        return new Car();
    }
}
