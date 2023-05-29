package Link;
public class Link {
    
    public int iData;
    public Link next;
    public Link(int s){
        iData=s;
        next=null;
    }
    public void displayLink(){
        System.out.println(iData);
    }
}

class LinkList{
    private Link first;
    public LinkList(){
        first=null;
    }
    public void displayLinkList(){
        Link current = first;
        while(current!=null){
            current.displayLink();
            current = current.next;
        }
    }
    public Link Find(int key){
        Link current = first;
        while(current!=null){
            if(current.iData==key){
                return current;
            }else{
                current = current.next;
            }
        }
        return null;
    }

    public void insertFirst(int newData){
        Link link = new Link(newData);
        link.next = first;
        first = link;
    }

    public boolean InsertAfter(int key,int newData){
        Link current = first;
        Link link = new Link(newData);
        while(current!=null){
            if(current.iData==key){
               link.next = current.next;
               current.next = link;
               return true;
            }else{
               current = current.next;
            }
           
        }
        return false;
    }

    public boolean deleteAfter(int key){
        Link current = first;
        Link previous = first;
        while(current!=null){
            if(current.iData==key){
                previous.next = current.next;
                return true;
            }else{
                previous = current;
                current = current.next;
            }
        }
        return false;
        
    }

    public boolean delete(int key){
        Link current = first;
        Link previous = first;
        while(current!=null){
            if(current.iData==key){
                if(current==first){
                    first=first.next;
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
    


    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }


}
