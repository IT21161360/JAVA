package ThirdLesson;

public class Link {

     public int id;
     public Link next;
     public Link(int s){
        id=s;
        next=null;
     }
     public void displayLink(){
        System.out.println(id);
     }
}

class LinkedLists{

    private Link first;
    
    public LinkedLists(){
      first = null;
    }

    public void displayLinkedList(){
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
         }
      }
      return null;
    }

    public void insertFirst(int key){
       Link newLink = new Link(key);
       newLink.next = first;
       first = newLink;
    }

    public boolean insertAfter(int key,int newLink){
      Link current = first;
      Link newlink = new Link(newLink);
      while(current!=null){
         if(current.id==key){
             newlink.next = current.next;
             current.next = newlink;
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
         if(current.id==key){
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
        }
      }
      return false;
    }

   





    

}
