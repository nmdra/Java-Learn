package Test.VersionB;

import java.util.Random;

public class MenInBlack2 extends MenInBlack
{
    public MenInBlack2(AlienPack a)
    {
        super(a);
        score = 0;
    }

    public void kill()
    {
        Alien arr[] = ap.getAliens();

        for (Alien alien : arr) {
            Random rand = new Random();

            this.score = this.score + alien.getScore();

            if (rand.nextInt() % 2 == 1) {
                this.score = this.score - 2;
            }
        }
    }
}