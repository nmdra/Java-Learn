package OnlineTest.OnlineTest2.VersionD;

public class CharArray {

    char[] myCharArray;

    public CharArray(char[] myCharArray) {
        this.myCharArray = myCharArray;
    }

    void swapFirstandLast() {
        char x=myCharArray[0];
        myCharArray[0]=myCharArray[myCharArray.length-1];
        myCharArray[myCharArray.length-1]=x;
    }

    void displayatrry() {
        for (char c : myCharArray) {
            System.out.println(c);
        }
    }

    void displayString() {
        System.out.println(String.valueOf(myCharArray));
    }
}

