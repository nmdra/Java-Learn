package OnlineTest.VersionF;

import java.util.Scanner;

public class AlarmClock {

    int Hour;
    int minutes;
    int seconds;

    public AlarmClock() {
        this.Hour = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    public void inputAlarm() throws timeException {

        Scanner ss = new Scanner(System.in);
        System.out.println("Enter Time: ");

        this.Hour = ss.nextInt();
        this.minutes = ss.nextInt();
        this.seconds = ss.nextInt();

        try
        {
            if((Hour < 0 || Hour > 12) || (minutes <= 0 || minutes > 60) || (seconds <= 0 || seconds > 60))
            {
                throw new timeException("Time is wrong");
            }
        }

        catch(NumberFormatException e)
        {
            throw new timeException("Time is wrong");
        }

        catch(timeException e)
        {
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }

    public void showAlarm() {
        System.out.println("Hour :" + Hour);
        System.out.println("Minutes :" + minutes);
        System.out.println("Seconds :" + seconds);
    }

    public void SetAlarm() {

    }

}