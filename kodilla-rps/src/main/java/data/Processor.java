package data;

public class Processor {
    protected static int userChoice;
    protected static int pcChoice;
    protected static int pcScore;
    protected static int userScore;
    

    public int getUserChoice() {
        return userChoice;
    }

    public int getPcChoice() {
        return pcChoice;
    }

    public int getPcScore() {
        return pcScore;
    }

    public int getUserScore() {
        return userScore;
    }


    public void setUserChoice(int userChoice) {
        this.userChoice = userChoice;
    }

    public void setPcChoice(int pcChoice) {
        this.pcChoice = pcChoice;
    }

    public void setPcScore(int pcScore) {
        this.pcScore = pcScore;
    }

    public void setUserScore(int userScore) {
        this.userScore = userScore;
    }


    public int playGame() {
        UserChoice userChoice = new UserChoice();
        MenuOfChoice menuOfChoice = new MenuOfChoice();
        BattleResult battleResult = new BattleResult();

        while (getUserChoice() != 4) {
            setUserChoice(menuOfChoice.makeChoice());
            switch (getUserChoice()) {
                case 1:
                    userChoice.chooseRock();
                    break;
                case 2:
                    userChoice.choosePaper();
                    break;
                case 3:
                    userChoice.chooseScissors();
                    break;
                case 6:
                    while (getUserChoice() == 6) {
                        setUserChoice(menuOfChoice.makeChoice());
                    }
                    break;
                case 5:
                    userChoice.chooseRepeat();
                    break;
            }
            battleResult.printWarStats();
        }
        if (getPcScore() > getUserScore()) {
            return 2;
        }
        if (getPcScore() < getUserScore()) {
            return 1;
        }
        return 0;
    }
}

