public class Links {
    
    public int iData;
    public Links next;
    public Links(int s){
        iData = s;
        next = null;
    }
    public void displayLink(){
        System.out.println(iData);
    }
}

class LinkedLists{
    private Links first;
    public LinkedLists(){
        first = null;
    }
    public void displayLinkedList(){
        Links current = first;
        while(current!=null){
            current.displayLink();
            current = current.next;
        }
    }

    public boolean find(int key){
        Links current = first;
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
        Links newLink = new Links(newData);
        newLink.next = first;
        first = newLink;
    }

    public boolean insertAfter(int key,int newData){
        Links current = first;
        Links newLink = new Links(newData);
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

    public Links deleteFirst(){
        Links temp = first;
        first = first.next;
        return temp;
    }

    public boolean deleteAfter(int key){
        Links current = first;
        Links previous = first;
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
