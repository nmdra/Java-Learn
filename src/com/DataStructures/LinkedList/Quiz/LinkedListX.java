package DataStructures.LinkedList.Quiz;

public class LinkedListX {

    private LinkX  first;

    public LinkedListX() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(String name, double avg) {
        LinkX newLink = new LinkX(name, avg);
        newLink.next = first;
        first = newLink;
    }

    public void insertEnd(String name, double avg) {

        LinkX newLink = new LinkX(name, avg);

        if(isEmpty()){
            first = newLink;
        } else {
            LinkX current = first;
            while(current.next != null){
                current = current.next;
            }
            current.next = newLink;
        }
    }

    public void displayList() {
        LinkX current = first;

        while(current != null) {
            current.displayDetails();
            current = current.next;
        }
    }

    public void deleteAll() {
        first = null;  // Simply make the first point to null, removing all links
        System.out.println("All elements deleted.");
    }


    public void find(String key) {
        LinkX current =  first;

        while(current!=null) {     // loops every link

            if(current.name.equals(key)) {
                current.displayDetails();
                return;
            }
            else
                current = current.next;
        }

        System.out.println("Not Found");   // if there is no value that's mean loop is going to null so that it return false
    }
}
