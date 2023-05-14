public class LinkClass{

     public int iData;
     public Link next;

     public LinkClass(int s){
        iData =s;
        next = null;
     }
     public void displayLink(){
        System.out.println(iData);
     }
}

class LinkedListClass{

    private Link first;
    public LinkedListClass(){
        first = null;
    }

    public void displayLinkedList(){
        Link current = first;
        if(current!=null){
            current.displayLink();
            current = current.next;
        }
    }

    public boolean find(int key){
        Link current = first;
        while(current!=null){
            if(current.iData==key){
                return true;
            }else{
                current = current.next;
            }
        }
        return false;
    }

    public void insertFirst(int newData){
        Link newLink = new Link(newData);
        newLink.next = first;
        first = newLink;
    }

    public boolean insertAfter(int key,int newData){
        Link newLink = new Link(newData);
        Link current = first;
        while(current!=null){
            if(current.iData==key){
                newLink.next = current.next;
                current.next = newLink;
                return true;
            }else{
                current = current.next;
            }
        }
        return false;
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }

    public boolean deleteAfter(int key){
        Link current = first;
        Link previous = first;
        while(current!=null){
            if(current.iData==key){
                if(current==first){
                    first = first.next;
                    return true;
                }else{
                previous.next = current.next;
                return true;
                }
            }else{
                previous = current;
                current = current.next;
            }
        }
        return false;
    }
}