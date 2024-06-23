package DataStructures.LinkedList.LinkedList1;

// this class contain single Link
public class Link {
    // link has two properties
    public int iData;   //  we make it as public to make accessible to LinkedList class
    public Link next;   // next data type is Link becaue next contain a reference of a next Link object

    // constructor of Link
    public Link(int iData) {
        this.iData =  iData;
        next = null;   // i have to make this null because in 1st step there is no any next
    }

    // this method is for display a single Link
    public void displayLink() {
        System.out.println(iData);
    }
}
