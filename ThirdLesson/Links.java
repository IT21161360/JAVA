package ThirdLesson;

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
    public void displayLinkList(){
        Links current = first;
        while(current!=null){
            current.displayLink();
            current = current.next;
        }
    }
    public Links find(int key){
         Links current = first;
         while(current!=null){
            if(current.iData==key){
                return current;
            }else{
                current = current.next;
            }
         }
         return null;
    }

    public void insertFirst(int newLink){
        Links link = new Links(newLink);
        link.next = first;
        first = link;

    }

    public boolean insertAfter(int key,int newLink){
        Links current = first;
        Links link = new Links(newLink);
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
        

    public Links deleteFirst(int key){
        Links temp = first;
        first = first.next;
        return temp;
    }

    public Links deleteAfter(int key){
        Links current = first;
        Links previous = first;
        while(current!=null){
            if(current.iData==key){
                previous.next = current.next;
                return current;
            }else{
                previous = current;
                current = current.next;
            }
        }
        return null;
    }

    public Links delete(int key){
        Links current = first;
        Links previous = first;
        while(current!=null){
            if(current.iData==key){
                if(current==first){
                    first = first.next;
                    return current;
                }else{
                previous.next = current.next;
                return current;
                }
            }else{
                previous = current;
                current = current.next;
            }
        }
        return null;
    }


}
