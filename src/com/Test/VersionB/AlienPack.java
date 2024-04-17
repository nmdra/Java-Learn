package Test.VersionB;

public class AlienPack
{
    Alien[] arr;

    public AlienPack(int noOfAliens)
    {
        arr = new Alien[noOfAliens];
    }

    public void addAliens(Alien a, int index)
    {
        arr[index] = a;
    }
    public Alien[] getAliens()
    {
        return arr;
    }
}