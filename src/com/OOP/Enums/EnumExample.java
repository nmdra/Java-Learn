package basic;

// Define an enum called Weekday
enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumExample {

    public static void main(String[] args) {

        // Using the values of the Weekday enum
        Weekday today = Weekday.FRIDAY;

        // Switch statement with enum
        switch (today) {
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday!");
                break;
            case FRIDAY:
                System.out.println("It's Friday!");
                break;
            default:
                System.out.println("It's not Monday, Wednesday, or Friday.");
        }

        // Iterate over all values of the Weekday enum
        System.out.println("All weekdays:");
        for (Weekday day : Weekday.values()) {
            System.out.println(day);
        }
    }
}
