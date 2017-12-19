package app;

import data.Intro;
import data.MenuOfChoice;
import data.Processor;

public class RpsRunner {
   public static void main(String[] args) {
       Intro intro = new Intro();
       MenuOfChoice menuOfChoice = new MenuOfChoice();
       Processor processor = new Processor(menuOfChoice);
       intro.printLogo();
       intro.printFinished(processor.playGame());
       intro.printLogo();
   }
}
