public class Link {
    public int iData;
    public Link next;

    public Link(int s) {

        iData = s;
        next = null;
    }

    public void displayLink() {
        System.out.println(iData);
    }
}

class LinkedList {
    private Link first;

    public LinkedList() {
        first = null;
    }


     public void displayList(){
        Link current = first;
        while(current!=null){
            current.displayLink();
            current = current.next;
        }
     }


     public boolean isEmpty(){
        Link current = first;
        if(current==null){
            return true;
        }else{
            return false;
        }
     }

     public void linkList(){
        Link current = first;
        if(current!=null){
            current.displayLink();
            current = current.next;
        }
     }


    public void displayLinkedList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }

    public boolean find(int key) {
        Link current = first;
        while (current != null) {
            if (current.iData == key) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public void insertFirst(int link) {
        Link newLink = new Link(link);
        newLink.next = first;
        first = newLink;
    }

    public boolean insertAfter(int key, int newData) {
        Link newLink = new Link(newData);
        Link current = first;
        while (current != null) {
            if (current.iData == key) {
                newLink.next = current.next;
                current.next = newLink;
                return true;
            } else {
                current = current.next;
            }
        }
        return false;

    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public boolean delete(int key) {
        Link current = first;
        Link previous = first;
        while (current != null) {
            if (current.iData == key) {
                if (current == first) {
                    first = first.next;
                    return true;
                } else {
                    previous.next = current.next;
                    return true;
                }
            } else {
                previous = current;
                current = current.next;
            }
        }
        return false;
    }

}

// Tute 3
// Question 1

// first //p0 //p1 //p2 // p3 //null
// first //p2 //p1 //p0 //p3 //null

// Link p0 = first;
// p1 = p0.next;
// p2 = p1.next;
// p3 = p2.next;
// p3.next = null;

// first = Link p2;
// p2.next = p1;
// p1.next = p0;
// p0.next = p3;
// p3.next = null;
