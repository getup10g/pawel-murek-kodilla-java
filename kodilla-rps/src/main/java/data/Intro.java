package data;

public class Intro {
    public void printLogo() {
        // view about User board
        System.out.println("-------------------");
        System.out.println("Rock-Paper-Scissors");
        System.out.println("-------------------");
    }
    public void printFinished(int result){
        switch (result) {
            case 0:
                System.out.println("-------------------");
                System.out.println("    REMIS");
                System.out.println("-------------------");
            case 1:
                System.out.println("-------------------");
                System.out.println("    YOU WIN ");
                System.out.println("-------------------");
                break;
            case 2:
                System.out.println("-------------------");
                System.out.println("     PC WIN ");
                System.out.println("-------------------");
        }
    }
}
