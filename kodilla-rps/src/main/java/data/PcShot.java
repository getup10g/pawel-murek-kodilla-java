package data;

import java.util.Random;

public class PcShot {

    public int Fight(int userShot) {
        Random randomShot = new Random();
        int shot = randomShot.nextInt(3);
        if (shot > 1) {
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

