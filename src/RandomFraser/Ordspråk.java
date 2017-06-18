package RandomFraser;

import java.util.Random;
public class Ordspråk {

    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(Citat.QUOTES[rand.nextInt(Citat.QUOTES.length)]);
    }
}