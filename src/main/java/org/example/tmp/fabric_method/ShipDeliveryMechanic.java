package org.example.tmp.fabric_method;

public class ShipDeliveryMechanic extends Mechanic{
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
