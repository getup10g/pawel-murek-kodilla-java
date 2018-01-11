package com.kodilla.patterns.strategy.social;

public interface SocialPublisher {
    String share(String post);
}
   /* W katalogu src/main/java utwórz pakiet com.kodilla.patterns.strategy.social
        Utwórz klasę User zawierającą nazwę użytkownika
        Utwórz dziedziczące z niej klasy Millenials, YGeneration oraz ZGeneration
        Stwórz interfejs SocialPublisher zawierający metodę share()
        Stwórz implementujące go klasy FacebookPublisher, TwitterPublisher oraz SnapchatPublisher
        - niech wyświetlają nazwę medium społecznego, którego używają
        Zastosuje wzorzec Strategy do klas User oraz klas dziedziczących z tej klasy
        - w konstruktorze ustaw dla danej kategorii użytkownika odpowiednie medium społecznościowe,
        a w klasie User dodaj metodę sharePost()
        W katalogu src/test/java stwórz pakiet com.kodilla.patterns.strategy.social
        Utwórz zestaw testów UserTestSuite, a w nim dwa testy: testDefaultSharingStrategies()
        oraz testIndividualSharingStrategy()sprawdzające czy domyślnie utworzone obiekty
        generujące wpisy w mediach społecznościowych są poprawne,
        a także czy możliwa jest indywidualna zmiana upodobań użytkownika.*/