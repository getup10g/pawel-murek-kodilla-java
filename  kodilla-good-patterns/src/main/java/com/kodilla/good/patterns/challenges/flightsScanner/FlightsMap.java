package com.kodilla.good.patterns.challenges.flightsScanner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FlightsMap {
    private HashMap<String,ArrayList<String>> flightsMap = new HashMap<>();

    public void addCityConnection(String city, ArrayList<String> flightsDestinations) {
        flightsMap.put(city, flightsDestinations);
    }

    public HashMap<String, ArrayList<String>> getFlightsMap() {
        return flightsMap;
    }


}
