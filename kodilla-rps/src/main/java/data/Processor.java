package data;

public class Processor {
    MenuOfChoice menuOfChoice;
    public Processor(MenuOfChoice menuOfChoice){
        this.menuOfChoice=menuOfChoice;
    }
    public int playGame(){
        int choice=0;
        int pcResult=0;
        int userResult=0;
        int score=0;
        PcShot pcShot = new PcShot();
      while(choice!=4) {
          choice = menuOfChoice.makeChoice();
          switch (choice) {
              case 1:
                  score=pcShot.Fight(1);
                  if(score==2){
                      System.out.println("You lose");
                      pcResult++;
                  }
                  break;
              case 2:
                  score=pcShot.Fight(2);
                  if(score==3){
                      System.out.println("You lose");
                      pcResult++;
                  }
                  break;
              case 3:
                  score=pcShot.Fight(3);
                  if(score==1){
                      System.out.println("You lose");
                      pcResult++;
                  }
                  break;
              case 6:
                  while (choice == 6) {
                choice = menuOfChoice.makeChoice(); }
                  break;
              case 5:
                  pcResult=0;
                  userResult=0;
                  break;
          }
          if(choice==score){
              System.out.println("Remis");
          } if(score==0){
              System.out.println("You win");
              userResult++;
          }
          System.out.println("PC score:" + pcResult+" User score:" + userResult);
        }
        if(pcResult>userResult){
        return 2;
      }if(pcResult<userResult){
            return 1;
        }
        return 0;

    }
}
