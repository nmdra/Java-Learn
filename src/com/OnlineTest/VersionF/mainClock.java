package OnlineTest.VersionF;

import java.util.ArrayList;

    public class mainClock {

        public static void main(String[] args) throws timeException {

            AlarmClock ac1 = new AlarmClock();
            AlarmClock ac2 = new AlarmClock();

            ArrayList<AlarmClock> al = new ArrayList<>();

            al.add(ac1);
            al.add(ac2);

            for( AlarmClock a : al) {
                System.out.println(a);
            }

            ac1.inputAlarm();
            ac1.showAlarm();
            ac2.SetAlarm();


        }
}