package LabEx.Lab1;

class Lab1Ex4 {
    public static void main(String[] args) {

        int dayNumber = 4;
        String day;

        System.out.println("Value of the day : " + dayNumber);

        day = switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Day";
        };

/*        switch (dayNumber) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;

            default:
                day = "Invalid Day";
        }*/

        System.out.println("Day of the week : " + day);

        System.out.println("Good Bye!");
    }
}