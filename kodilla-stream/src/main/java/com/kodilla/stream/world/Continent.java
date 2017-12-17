package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Continent {
    ArrayList<Country> countryList = new ArrayList<>();


    public ArrayList<Country> getCountryList() {
        return countryList;
    }
    public void addCountry(Country country){
        countryList.add(country);
    }
}
