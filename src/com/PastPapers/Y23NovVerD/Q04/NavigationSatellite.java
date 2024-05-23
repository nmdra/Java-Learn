package PastPapers.Y23NovVerD.Q04;

public class NavigationSatellite implements ISatellite {
    String name;

    public NavigationSatellite(String name) {
        this.name = name;
    }

    @Override
    public void activate() {
        System.out.println(name + "NavigationSatellite activated");
    }

    @Override
    public void deactivate() {
        System.out.println(name + "NavigationSatellite deactivated");
    }
}
