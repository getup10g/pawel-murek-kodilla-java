package com.kodilla.good.patterns.challenges.flightsScanner;

import java.util.ArrayList;

public class FlightsMapBuilder {
    private FlightsMap flightsMap = new FlightsMap();

    public FlightsMap buildFlightsMap() {
        ArrayList<String> fromKrakow = new ArrayList<>();
        fromKrakow.add("Poznan");
        fromKrakow.add("Warszawa");
        fromKrakow.add("Gdansk");
        fromKrakow.add("Wroclaw");
        ArrayList<String> fromWarszawa = new ArrayList<>();
        fromWarszawa.add("Poznan");
        fromWarszawa.add("Krakow");
        fromWarszawa.add("Gdansk");
        fromWarszawa.add("Wroclaw");
        ArrayList<String> fromWroclaw = new ArrayList<>();
        fromWroclaw.add("Lublin");
        fromWroclaw.add("Szczecin");
        ArrayList<String> fromPoznan = new ArrayList<>();
        fromPoznan.add("Wroclaw");
        fromPoznan.add("Szczecin");
        ArrayList<String> fromLublin = new ArrayList<>();
        fromLublin.add("Wroclaw");
        fromLublin.add("Katowice");
        fromLublin.add("Poznan");

        flightsMap.addCityConnection("Krakow", fromKrakow);
        flightsMap.addCityConnection("Warszawa", fromWarszawa);
        flightsMap.addCityConnection("Wroclaw", fromWroclaw);
        flightsMap.addCityConnection("Poznan", fromPoznan);
        flightsMap.addCityConnection("Lublin", fromLublin);

        return flightsMap;
    }

}
