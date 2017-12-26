
package com.kodilla.exception.test;

public class Flight {
//    Stwórz klasę Flight zawierającą konstruktor, pole: String departureAirport, String arrivalAirport i getter’y.
    String departureAirport;
    String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}

