package com.kodilla.stream.beautifier;

public class StreamMain {
public static void main (String args[]) {
    PoemBeautifier poemBeautifier = new PoemBeautifier();
    PoemDecorator add = (text) -> {
        return text+"abc"+text;
    };
    PoemDecorator addABC = (text) -> {
        return "abc"+text+"abc";
    };
    PoemDecorator qwerty = (text) -> {
        return "qwerty";
    };
    poemBeautifier.beautify("TEkst", String::toLowerCase);
    poemBeautifier.beautify("TEkst", String::toUpperCase);
    poemBeautifier.beautify("TEkst", add);
    poemBeautifier.beautify("TEkst", addABC);
    poemBeautifier.beautify("TEkst", qwerty);
    poemBeautifier.beautify("TEkst", text -> text);
    poemBeautifier.beautify("TEkst", reference::addString);
}

    /*
    W metodzie main(String[] args) klasy StreamMain, utwórz obiekt klasy PoemBeautifier i wywołaj kilka razy
    metodę beautify z różnymi tekstami i różnymi upiększaczami tekstu (wyrażenia lambda).
Przykładowymi upiększaczami tekstu mogą być na przykład kody dopisujące znaki “ABC” na
początku i na końcu otrzymanego tekstu lub kody zmieniające cały otrzymany tekst na duże litery (skorzystaj
z metody toUpperCase() klasy String).
Wymyśl również dwa własne upiększacze.
Kod zadania prześlij do Github.
     */
}
