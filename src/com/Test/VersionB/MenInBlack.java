package Test.VersionB;

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
        Alien arr[] = ap.getAliens();

        for(int i =0 ; i<arr.length ; i++)
        {
            this.score = this.score + arr[i].getScore();
        }
    }
}