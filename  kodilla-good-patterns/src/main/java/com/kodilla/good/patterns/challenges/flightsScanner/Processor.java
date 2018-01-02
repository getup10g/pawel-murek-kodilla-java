package com.kodilla.good.patterns.challenges.flightsScanner;

import java.util.List;
import java.util.stream.Collectors;

public class Processor {
    private FlightsMap flightsMap;

    public Processor(FlightsMap flightsMap) {
        this.flightsMap = flightsMap;
    }

    public String findDirectConnectionFrom(String city){
        String theResult = flightsMap.getFlightsMap().entrySet().stream()
                .filter(s -> s.getKey().equals(city))
                .flatMap(s -> s.getValue().stream())
                .collect(Collectors.joining(", "));

        return "Available connections from "+city+" to: "+theResult;
    }

    public String findDirectConnectionTo(String city){
        String theResult = flightsMap.getFlightsMap().entrySet().stream()
                .filter(s -> s.getValue().contains(city))
                .map(s -> s.getKey())
                .collect(Collectors.joining(", "));

        return "Connections to "+city+" are from: "+theResult;
    }

    public String findMultiCityConnection(String city,String city3){
        List<String> theResult1 = flightsMap.getFlightsMap().entrySet().stream()
                .filter(s -> s.getKey().equals(city))
                .flatMap(s -> s.getValue().stream())
                .collect(Collectors.toList());
        for (String city1:theResult1) {
            if(city1.equals(city3)){
                return "You have a direct connection to the "+city3;
            }
            List<String> theResult2 = flightsMap.getFlightsMap().entrySet().stream()
                    .filter(s -> s.getKey().equals(city1))
                    .flatMap(s -> s.getValue().stream())
                    .collect(Collectors.toList());
            for (String city2:theResult2) {
                if(city2.equals(city3)) {
                    return "You have a connection via the airport " + city1;
                }
            }
        }
        return "The connection between the given cities does not exist";
    }

    public String findMultiCityConnection2(String city,String city2,String city3){
        if(findDirectConnectionFrom(city).contains(city2)){
            if(findDirectConnectionFrom(city2).contains(city3)){
                return "Connection from "+city+" via "+city2+ " to " + city3+" is possible";
            }
        }
        return "Connection from "+city+" via "+city2+ " to " + city3+" is not possible";
    }
}
