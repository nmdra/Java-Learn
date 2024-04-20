package OnlineTest.OnlineTest2.VersionB.Example1;

public class MenInBlack
{
    int score;
    AlienPack ap;

    public MenInBlack(AlienPack a)
    {
        ap = a;
        score = 0;
    }

    public int getScore()
    {
        return score;
    }

    public void kill()
    {
        Alien[] arr = ap.getAliens();

        for (Alien alien : arr) {
            this.score = this.score + alien.getScore();
        }
    }
}