package org.example.tmp.fabric_method;

public abstract class Mechanic {

    void inform() {
        Transport transport = createTransport();
        System.out.println("The transport on his way: " + transport.go());
    }

    abstract Transport createTransport() ;
}
