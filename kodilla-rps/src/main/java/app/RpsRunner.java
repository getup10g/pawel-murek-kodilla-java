package app;

import data.Intro;
import data.MenuOfChoice;
import data.Processor;

public class RpsRunner {
    public static void main(String[] args) {
        Intro intro = new Intro();
        Processor processor = new Processor();
        intro.printLogo();
        intro.printFinished(processor.playGame());
    }
}
