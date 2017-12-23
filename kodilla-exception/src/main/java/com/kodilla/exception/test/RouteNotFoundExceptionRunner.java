package com.kodilla.exception.test;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args){
        Flight flight = new Flight("Manch", "London");
        FlightsFinder flightsFinder = new FlightsFinder();
        String isPossible = "is impossible";
        try {
            Boolean route1 = flightsFinder.findFlight(flight);
            if(route1){
                isPossible = "is possible";
            }
            System.out.println("Flight between: "+flight.getDepartureAirport()+" - "+flight.getArrivalAirport()+" "+isPossible);
        }
        catch (RouteNotFoundException e){
            System.out.println("Route not found");
        }
    }
}
