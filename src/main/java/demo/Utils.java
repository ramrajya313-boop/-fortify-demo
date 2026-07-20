package demo;

import java.util.Random;

public class Utils {

    public int generateOTP() {

        Random random = new Random();

        return random.nextInt(999999);

    }

}