package data;

public class Intro {

    private final String DASHED_LINE="-------------------";
    private final String LOGO=getDASHED_LINE()+"\n"+"Rock-Paper-Scissors"+"\n"+getDASHED_LINE();
    private final String SCORE_DRAW=getDASHED_LINE()+"\n"+"    SCORE DRAW"+"\n"+getDASHED_LINE();
    private final String YOU_WON=getDASHED_LINE()+"\n"+"    YOU WON"+"\n"+getDASHED_LINE();
    private final String PC_WON=getDASHED_LINE()+"\n"+"    PC WON"+"\n"+getDASHED_LINE();

    public String getDASHED_LINE() {
        return DASHED_LINE;
    }

    public String getLOGO() {
        return LOGO;
    }

    public String getSCORE_DRAW() {
        return SCORE_DRAW;
    }

    public String getYOU_WON() {
        return YOU_WON;
    }

    public String getPC_WON() {
        return PC_WON;
    }

    public void printLogo() {
        System.out.println(getLOGO());
    }

    public void printFinished(int result){
        switch (result) {
            case 0:
                System.out.println(getSCORE_DRAW());
            case 1:
                System.out.println(getYOU_WON());
                break;
            case 2:
                System.out.println(getPC_WON());
        }
    }
}
