package Test.VersionD;

public class CharArray {

    char[] myCharArray;

    public CharArray(char[] myCharArray) {
        super();
        this.myCharArray = myCharArray;
    }

    void swapFirstandLast() {
        char x=myCharArray[0];
        char y=myCharArray[myCharArray.length-1];
        myCharArray[0]=y;
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

