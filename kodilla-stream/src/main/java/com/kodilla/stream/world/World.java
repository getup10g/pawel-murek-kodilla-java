package com.kodilla.stream.world;


import java.math.BigDecimal;
import java.util.ArrayList;

public class World {


    ArrayList<Continent> continentList = new ArrayList<>();

    public ArrayList<Continent> getContinentList() {
        return continentList;
    }

    public void addContinent(Continent continent){
        continentList.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal totalSand = getContinentList().stream()
                .flatMap(Continent-> Continent.getCountryList().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        return totalSand;

    }
    }
//    public Set<String> getLocationsOfFriendsOfFriends() {
//        return friends.stream()
//                .flatMap(user -> user.getFriends().stream())
//                .filter(user -> user != this)
//                .map(ForumUser::getLocation)
//                .collect(Collectors.toSet());
//    }

