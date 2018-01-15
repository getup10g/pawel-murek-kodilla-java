package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients;

    private Bigmac(final String roll,final int burgers,final String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public static class BigmacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();
        public static final String SESAMESEEDS="with sesame seeds";
        public static final String STANDARD= "standard";
        public static final String ISLANDS = "1000 islands";
        public static final String BARBEQUE= "barbeque";
        public static final ArrayList<String> PossibleIngredients  = new ArrayList(Arrays.asList("lettuce","onion","bacon","chilli","prawns","mushrooms","cucumber"));

        public BigmacBuilder roll(String roll) {
            if(roll.equals(SESAMESEEDS)) {
                this.roll = roll;
            } else {
                this.roll = STANDARD;
            }
            return this;
        }
        public BigmacBuilder sauce(String sauce) {
            if(sauce.equals(ISLANDS)|| sauce.equals(BARBEQUE)) {
                this.sauce = sauce;
            } else {
                this.roll = STANDARD;
            }
            return this;
        }

        public BigmacBuilder burgers(int number){
            this.burgers = number;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            if(PossibleIngredients.contains(ingredient)) {
                ingredients.add(ingredient);
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(roll,burgers,sauce,ingredients);
        }
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}



