package Stack;

public class Link {

    public int id;
    public Link next;

    public Link(int s){
        id=s;
        next=null;
    }

    public void displayLink(){
        System.out.print(id);
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

   public Link find(int key){
       Link current = first;
       while(current!=null){
         if(current.id==key){
             return current;
        }else{
            current = current.next;
        }if(current==null){
            return null;
      }
    }
     return null;
   }

   public void insertFirst(int newData){
      Link newLink = new Link(newData);
      newLink.next = first;
      first = newLink;
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
        if(current.id==key){
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
                return true;
        }
      }
      return false;
   }
 
   public boolean insertAfter(int key,int newData){
      Link current = first;
      Link newLink = new Link(newData);
      while(current!=null){
         if(current.id==key){
             newLink.next = current.next;
             current.next = newLink;
             return true;
         }else{
            current = current.next;
            return true;
         }
      }
      return false;
   }

}


