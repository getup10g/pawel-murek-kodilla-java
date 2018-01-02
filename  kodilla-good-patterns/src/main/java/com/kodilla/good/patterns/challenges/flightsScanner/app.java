package com.kodilla.good.patterns.challenges.flightsScanner;

public class app {
    public static void main(String args[]) {
        String line="--------";
        FlightsMapBuilder flightsMapBuilder = new FlightsMapBuilder();
        Processor processorWizzAir = new Processor(flightsMapBuilder.buildFlightsMap());
        System.out.println(line);
        System.out.println(processorWizzAir.findDirectConnectionFrom("Warszawa"));
        System.out.println(processorWizzAir.findDirectConnectionFrom("Wroclaw"));
        System.out.println(processorWizzAir.findDirectConnectionFrom("Poznan"));
        System.out.println(line);
        System.out.println(processorWizzAir.findDirectConnectionTo("Poznan"));
        System.out.println(processorWizzAir.findDirectConnectionTo("Lublin"));
        System.out.println(processorWizzAir.findDirectConnectionTo("Poznan"));
        System.out.println(line);
        System.out.println(processorWizzAir.findMultiCityConnection("Krakow", "Poznan"));
        System.out.println(processorWizzAir.findMultiCityConnection("Wroclaw", "Katowice"));
        System.out.println(processorWizzAir.findMultiCityConnection("Krakow", "Szczecin"));
        System.out.println(line);
        System.out.println(processorWizzAir.findMultiCityConnection2("Warszawa", "Poznan", "Wroclaw"));
        System.out.println(processorWizzAir.findMultiCityConnection2("Warszawa", "Szcecin", "Wroclaw"));
        System.out.println(processorWizzAir.findMultiCityConnection2("Warszawa", "Wroclaw", "Lublin"));
    }
}
