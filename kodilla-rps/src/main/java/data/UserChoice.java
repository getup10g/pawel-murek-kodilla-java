package data;

public class UserChoice extends Processor{
    PcShot pcShot = new PcShot();
    BattleResult battleResult = new BattleResult();

    public void chooseRock(){
        setPcChoice(pcShot.Fight(1));
        battleResult.printBattleSetScore(2);
    }

    public void choosePaper(){
        setPcChoice(pcShot.Fight(2));
        battleResult.printBattleSetScore(3);
    }

    public void chooseScissors(){
        setPcChoice(pcShot.Fight(3));
        battleResult.printBattleSetScore(1);
    }

    public void chooseRepeat(){
        setPcScore(0);
        setUserScore(0);
    }
}

