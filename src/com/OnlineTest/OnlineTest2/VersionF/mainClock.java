package OnlineTest.OnlineTest2.VersionF;

import java.util.ArrayList;

    public class mainClock {

        public static void main(String[] args) throws timeException {

            AlarmClock ac1 = new AlarmClock();
            AlarmClock ac2 = new AlarmClock();

            ArrayList<AlarmClock> al = new ArrayList<>();

            al.add(ac1);
            al.add(ac2);

            ac1.inputAlarm();
            ac2.SetAlarm(1,22,44);

            for(AlarmClock clock : al){
                clock.showAlarm();
                System.out.println();
            }

        }
}