package Test.VersionA.Example3;

class Lottery3 {
    private int[] lotteryNumbers = new int[5];

    /**
     * <a href="https://stackoverflow.com/questions/7922978/random-numbers-with-math-random-in-java">Math.Random</a>
     */

    public Lottery3() {

        int max = 9;
        int min = 0;
        int range = max - min + 1;

        for (int i = 0; i < lotteryNumbers.length; i++) {
            int rand = (int) (Math.random() * range) + min;
            lotteryNumbers[i] = rand;
        }
    }

    private int[] lotteryPics(int[] arrayOfInteger) {
        int[] matchingDigits = new int[]{-1, -1, -1, -1, -1};

        for (int i = 0; i < lotteryNumbers.length; i++) {
            if (lotteryNumbers[i] == arrayOfInteger[i]) {
                matchingDigits[i] = lotteryNumbers[i];
            }
        }

        return matchingDigits;
    }

    private void displayWiningNumbers() {
        System.out.print("\nLottery's Numbers : ");
        for (int lotteryNumber : lotteryNumbers) {
            System.out.print(lotteryNumber + "  ");
        }
    }

    private void displayUserNumbers(int[] arrayOfInteger) {

        System.out.print("\nUser Numbers: ");

        for (int j : arrayOfInteger) {
            System.out.print(j + "  ");
        }
    }

    private void displayMatchedDigits(int[] arrayOfInteger) {
        int matchedTimes = 0;

        System.out.print("\nMatching digits : ");

        for (int Digit : lotteryPics(arrayOfInteger)) {
            if (Digit != -1) {
                System.out.print(Digit + " ");
                matchedTimes++;
            }
        }

        System.out.print("\nMatched Times: " + matchedTimes);
    }

    public void display(int[] arrayOfInteger) {
        displayUserNumbers(arrayOfInteger);
        displayWiningNumbers();
        displayMatchedDigits(arrayOfInteger);
    }
}
