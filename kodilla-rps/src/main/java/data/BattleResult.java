package data;

public class BattleResult extends Processor {
    private final String EMPTY_LINE="\n";

    public String getEMPTY_LINE() {
        return EMPTY_LINE;
    }

    public void printBattleSetScore(int winnigFigure){

        System.out.println("User choice: "+getUserChoice()+" Pc choice: "+getPcChoice() );
        System.out.println(getEMPTY_LINE());

        boolean areChoicesTheSame = getUserChoice()==getPcChoice();
        boolean userWonBattle = getPcChoice()==0;
        boolean pcWonBattle = getPcChoice()==winnigFigure;
        if(pcWonBattle){
            System.out.println("You lose battle");
            setPcScore(getPcScore()+1);
        }
        if(areChoicesTheSame){
            System.out.println("The same choices");
        }
        if(userWonBattle){
            System.out.println("You won battle");
            setUserScore(getUserScore()+1);
        }
        System.out.println(getEMPTY_LINE());
    }
    public void printWarStats(){
        System.out.println("PC score:" + getPcScore()+" User score:" + getUserScore());
    }
}
