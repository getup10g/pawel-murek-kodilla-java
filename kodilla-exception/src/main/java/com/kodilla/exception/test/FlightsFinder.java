package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightsFinder {
    private HashMap<String, Boolean> routesMap = new HashMap<>();
//    Stwórz klasę zawierającą logikę imitującą wyszukiwanie lotów: a) metoda findFilght(Flight flight)
// b) wewnątrz metody zaimplementuj mapę typu HashMap, której kluczem będzie String przechowujący nazwę lotniska,
// a wartością Boolean informujący o tym czy można na dane lotnisko polecieć. Przykład: Map<String, Boolean>.
// c) logika powinna wyszukiwać loty w mapie. Jeżeli dane lotnisko nie będzie istnieć w mapie,
// należy rzucić wyjątkiem RouteNotFoundException.
   public FlightsFinder() {
       routesMap.put("Manchester", true);
       routesMap.put("London", true);
       routesMap.put("Madrid", true);
       routesMap.put("Moscow", true);
   }

    public HashMap<String, Boolean> getRoutesMap() {
        return routesMap;
    }
    public boolean findFlight(Flight flight) throws RouteNotFoundException{
       HashMap<String, Boolean> routesMap = getRoutesMap();
       if(flight!=null) {
            if (routesMap.containsKey(flight.getDepartureAirport()) && routesMap.containsKey(flight.getArrivalAirport())) {
                return true;
            }
            throw new RouteNotFoundException("Object user was empty");
        }
       return false;
    }
}
