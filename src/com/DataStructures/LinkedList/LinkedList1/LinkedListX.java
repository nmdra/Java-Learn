package DataStructures.LinkedList.LinkedList1;

// this class contain the collection of Links
public class LinkedListX {
    // there is special Link in linkList that call first
    private Link first;
    // constructor
    public LinkedListX() {
        first = null ;      // must equal to null because initially first is null   first will have a value in future
    }

    // method to display all the links in linkedList
    public void displayLinkedList() {

        Link current = first;            // temporary Link object that store the first at first Loop because we have to access value by link by link
        // while loop
        while(current!=null) {
            current.displayLink();
            current = current.next;     //  now current obj get the next Link object's next
        }
    }

    // method to find a value find(50)
    public boolean find(int key) {
        Link current =  first;

        while(current!=null) {     // loops every link

            if(current.iData == key)
                return true;
            else    //  if idata value is not equals to key we have to give chance to next link
                current = current.next;
        }
        return false;   // if there is no value that's mean loop is going to null so that it return false
    }

    // method to insert first or change the first
    public void insertFirst(int key) {

        Link newLink = new Link(key);	 // we have o create a newobject to newLink
        // first of all we have to set the next of newLik which is stored in first
        newLink.next = first;
        first = newLink;    //  after that finally you can set newLink to first
    }

    // this method is used to insert any data in any place of the link
    public boolean insertAfter(int key,int newKey) {
        Link newLink =  new Link(newKey);  // everytime if we insert a value to link you must create an object in Link

        Link current = first;     //  as above, we have to repeat it again

        while(current!=null) {
            if(current.iData ==  key) {   // if the key is equal to the current data
                newLink.next = current.next;   // accessing newLink from the current's nxt
                current.next =  newLink;   // now assign current next
                return true;
            }
            else
                current =  current.next;
        }

        return false;
    }

    public Link deleteFirst() {
        Link temp = first;   // store it in temp Link because we want to return that
        first =  first.next;

        return temp;
    }

    public boolean delete(int key) {

        Link current =  first;     // assume that current and the previous is in first
        Link previous = first;

        while(current!=null) {
            if(current.iData==key) {
                if(current==first) {   // if the first is deleting
                    first = first.next;
                    return true;
                }
                else {
                    previous.next = current.next;   // if the middle is deleting
                    return true;
                }

            }
            else {
                previous = current;
                current =  current.next;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return(first==null);
    }

    public static void main(String[] args) {
        LinkedListX LL01 =  new LinkedListX();

        LL01.insertFirst(23);
        LL01.insertFirst(89);
        LL01.insertFirst(12);
        LL01.insertFirst(55);

        LL01.displayLinkedList();

        while(!LL01.isEmpty()) {
            Link link = LL01.deleteFirst();
            System.out.println("deleted");
            link.displayLink();
        }
    }
}