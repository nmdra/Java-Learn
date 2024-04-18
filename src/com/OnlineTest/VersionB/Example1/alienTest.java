package OnlineTest.VersionB.Example1;

public class alienTest {

    public static void main(String[] args)
    {
        AlienPack pack1 = new AlienPack(5);
        pack1.addAliens(new MarshmalloAlien(), 0);
        pack1.addAliens(new OrgeAlien(), 1);
        pack1.addAliens(new OrgeAlien(), 2);
        pack1.addAliens(new SnakeAlien(), 3);
        pack1.addAliens(new MarshmalloAlien(), 4);

        MenInBlack AgentK = new MenInBlack(pack1);
        AgentK.kill();
        System.out.println( "Your score is " + AgentK.getScore());
//        MenInBlack2 AgentK2 = new MenInBlack2(pack1);
//        AgentK2.kill();
//        System.out.println( "Your score is " + AgentK2.getScore());
//
    }

}