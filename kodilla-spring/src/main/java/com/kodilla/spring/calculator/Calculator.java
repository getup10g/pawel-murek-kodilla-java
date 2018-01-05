package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Calculator {
   @Autowired
   private Display display;

    public double add(double a, double b){
        double result=a+b;
        display.displayValue(result);
        return result;
    }
    public double sub(double a, double b){
        double result=a-b;
        display.displayValue(result);
        return result;
    }
    public double mul(double a, double b){
        double result=a*b;
        display.displayValue(result);
        return result;
    }
    public double div(double a, double b){
        double result=a/b;
        display.displayValue(result);
        return result;
    }
}

/*
    W katalogu src/main/java utwórz pakiet com.kodilla.spring.calculator, a w nim klasę Display, która powinna być komponentem Springa.
        Klasa Display powinna mieć metodę displayValue(double val), która otrzymaną wartość wyświetla na ekranie konsoli
        W tym samym pakiecie utwórz klasę Calculator, która będzie komponentem Springa i będzie posiadała pole Display display.
         Użyj wstrzykiwania przez właściwość klasy do powiązania obiektów klas Calculator oraz Display ze sobą.
        Zaimplementuj cztery podstawowe działania matematyczne
        (zrób metody add(double a, double b), sub(double a, double b), mul(double a, double b) oraz
         div(double a, double b)) - obsługujące odpowiednio dodawanie, odejmowanie, mnożenie i dzielenie.
         Każda metoda powinna przed zwróceniem wyniku wywołać metodę displayValue(double val) obiektu display.
        W katalogu src/test/java stwórz pakiet com.kodilla.spring.calculator, a w nim zestaw testów CalculatorTestSuite.
        Napisz test testCalculations(), który przetestuje poprawność działania czterech metod wykonujących obliczenia.
        Stworzony kod prześlij do repozytorium Github*/