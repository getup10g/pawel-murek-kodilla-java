package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuOfChoice {
    public int makeChoice() {
        System.out.println("klawisz 1 - zagranie \"kamień\",\n" +
                "klawisz 2 - zagranie \"papier\",\n" +
                "klawisz 3 - zagranie \"nożyce\",\n" +
                "klawisz x - zakończenie gry, poprzedzone pytaniem \"Czy na pewno zakończyć grę?\",\n" +
                "klawisz n - uruchomienie gry od nowa, poprzedzone pytaniem \"Czy na pewno zakończyć aktualną grę?\",");

        String choice;
        int x = 0;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("\n");
        choice = odczyt.next();
        List<String> choiceList = new ArrayList<>();
        choiceList.add("1");
        choiceList.add("2");
        choiceList.add("3");
        choiceList.add("x");
        choiceList.add("n");
        if (choiceList.contains(choice)) {
            switch (choice) {
                case "1":
                    x = 1;
                    break;
                case "2":
                    x = 2;
                    break;
                case "3":
                    x = 3;
                    break;
                case "x":
                    System.out.println("Do you want exit?");
                    System.out.println("\n");
                    choice=odczyt.next();
                    if(choice.equals("yes")){
                        x=4;
                    } else x=6;
                    break;
                case "n":
                    System.out.println("Do you want repeat?");
                    System.out.println("\n");
                    choice=odczyt.next();
                    if(choice.equals("yes")){
                        x=5;
                    } else x=6;
                    break;
                }
            }else{
            x=6;
            }
        return x;
    }
}


