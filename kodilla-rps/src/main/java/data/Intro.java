package data;

public class Intro {
    private final String dashedLine="-------------------";

    public String getDashedLine() {
        return dashedLine;
    }

    public void printLogo() {

        // view about User board
        System.out.println(getDashedLine());
        System.out.println("Rock-Paper-Scissors");
        System.out.println(dashedLine);
    }
    public void printFinished(int result){
        switch (result) {
            case 0:
                System.out.println(getDashedLine());
                System.out.println("    SCORE DRAW");
                System.out.println(getDashedLine());
            case 1:
                System.out.println(getDashedLine());
                System.out.println("    YOU WON ");
                System.out.println(getDashedLine());
                break;
            case 2:
                System.out.println(getDashedLine());
                System.out.println("     PC WON ");
                System.out.println(getDashedLine());
        }
    }
}
