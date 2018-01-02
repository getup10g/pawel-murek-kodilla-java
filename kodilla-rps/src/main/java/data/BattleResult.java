package data;

public class BattleResult extends Processor {
    public void printStats(){
        System.out.println("user choice: "+getUserChoice()+" pc choice: "+getPcChoice() );
        //Same choices
        if(getUserChoice()==getPcChoice()){
            System.out.println("The same choices");
        }
        //User Won
        if(getPcChoice()==0){
            System.out.println("You won battle");
            setUserScore(getUserScore()+1);
        }
        System.out.println("PC score:" + getPcScore()+" User score:" + getUserScore());
    }
}
