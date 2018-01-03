package data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MenuOfChoice {
    private final String MENU_TEXT="klawisz 1 - zagranie \"kamień\",\n" +
            "klawisz 2 - zagranie \"papier\",\n" +
            "klawisz 3 - zagranie \"nożyce\",\n" +
            "klawisz x - zakończenie gry, poprzedzone pytaniem \"Czy na pewno zakończyć grę?\",\n" +
            "klawisz n - uruchomienie gry od nowa, poprzedzone pytaniem \"Czy na pewno zakończyć aktualną grę?\",";

    public String getMENU_TEXT() {
        return MENU_TEXT;
    }

    public int makeChoice() {
        System.out.println(getMENU_TEXT());
        int feedback = 0;
        Scanner reading = new Scanner(System.in);
        System.out.println("\n");
        String choice = reading.next();
        List<String> choiceList = new ArrayList<>(Arrays.asList("1", "2", "3","x","n"));

        if (choiceList.contains(choice)) {
            switch (choice) {
                case "1":
                    feedback = 1;
                    break;
                case "2":
                    feedback = 2;
                    break;
                case "3":
                    feedback = 3;
                    break;
                case "x":
                    System.out.println("Do you want exit?  yes/no");
                    System.out.println("\n");
                    choice=reading.next();
                    if(choice.equals("yes")){
                        feedback=4;
                    } else feedback=6;
                    break;
                case "n":
                    System.out.println("Do you want repeat?  yes/no");
                    System.out.println("\n");
                    choice=reading.next();
                    if(choice.equals("yes")){
                        feedback=5;
                    } else feedback=6;
                    break;
                }
            }else{
            feedback=6;
            }
        return feedback;
    }
}


