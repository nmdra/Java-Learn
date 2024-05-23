package PastPapers.Y23NovVerD.Q04;

public class SatelliteCenter {
    int option;
    ISatellite[] satellites;
    IGeoLocation[] geoLocations;

    public SatelliteCenter(int option, ISatellite[] satellites, IGeoLocation[] geoLocations) {
        this.option = option;
        this.satellites = satellites;
        this.geoLocations = geoLocations;
    }

    void startService(){
        if(option==1){
            for(ISatellite i:satellites){
                if(i.getClass().getSimpleName().equals("NavigationSatellite")){
                    i.activate();
                }
            }
        }

        if(option==0){
            for(ISatellite i:satellites){
                if(i instanceof DroneSatellite){
                    i.activate();
                }
            }
        }
    }

    void stopService(){
        for(ISatellite i:satellites){
            if(i instanceof NavigationSatellite && option==1){
                i.deactivate();
            } else if(i instanceof DroneSatellite && option==0){
                i.deactivate();
            }
        }
    }

    void locationService(){

        if(option==0){
            geoLocations[0].displayLocation();

        } else if(option==1){
            geoLocations[1].displayLocation();
        }
    }
}
