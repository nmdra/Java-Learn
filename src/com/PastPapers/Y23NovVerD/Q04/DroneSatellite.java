package PastPapers.Y23NovVerD.Q04;

public class DroneSatellite implements ISatellite {
   String name;

    public DroneSatellite(String name) {
        this.name = name;
    }

    @Override
    public void activate() {
        System.out.println(name + " DroneSatellite activated");
    }

    @Override
    public void deactivate() {
        System.out.println(name + " DroneSatellite deactivated");
    }
}
