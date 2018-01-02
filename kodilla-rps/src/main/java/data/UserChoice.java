package data;

public class UserChoice extends Processor{
    PcShot pcShot = new PcShot();
    public void chooseRock(){
        setPcChoice(pcShot.Fight(1));
        if(getPcChoice()==2){
            System.out.println("You lose battle");
            setPcScore(getPcScore()+1);
        }
    }
    public void choosePaper(){
        setPcChoice(pcShot.Fight(2));
        if(getPcChoice()==3){
            System.out.println("You lose battle");
            setPcScore(getPcScore()+1);
        }
    }
    public void chooseScissors(){
        setPcChoice(pcShot.Fight(3));
        if(getPcChoice()==1){
            System.out.println("You lose battle");
            setPcScore(getPcScore()+1);
        }
    }

    public void chooseRepeat(){
        setPcScore(0);
        setUserScore(0);
        }
}

