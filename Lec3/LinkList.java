package Lec3;

public class LinkList {

    private Link first;
    public LinkList(){
        first = null;
    }
    public void displayLinkedList(){
        Link current = first;
        while(current!=null){
            current.displayLink();
            current = current.next;
        }
    }
    
    
}
