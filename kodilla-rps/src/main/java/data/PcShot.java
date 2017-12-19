package data;

import java.util.Random;

public class PcShot {
    Random randomShot = new Random();
    Random randomDecision = new Random(3);


    public int Fight(int userShot) {
        int shot = randomShot.nextInt(4);
        if (shot > 2) {
            switch (userShot) {
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 1;
            }
        } if (shot == 1) {
                return userShot;
            }
        return 0;
        }
    }

