package data;

public class BattleResult extends Processor {
    public void printStats(){
        //Same choices
        if(getUserChoice()==getPcChoice()){
            System.out.println("The same choices");
        }
        //User Won
        if(getPcChoice()==0){
            System.out.println("You win battle");
            setUserScore(getUserScore()+1);
        }
        System.out.println("PC score:" + getPcScore()+" User score:" + getUserScore());
    }
}
