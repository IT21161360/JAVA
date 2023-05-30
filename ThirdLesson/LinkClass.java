package ThirdLesson;
import java.util.Scanner;

public class LinkClass {

    public int id;
    public LinkClass next;

    public LinkClass(int s){
        id = s;
        next = null;
    }
    public void displayLink(){
        System.out.println(id);
    }
}

class LinkedListClass{
    private LinkClass first;
    public LinkedListClass(){
        first = null;
    }
    public void displayLinkList(){
        LinkClass current = first;
        while(current!=null){
            current.displayLink();
            current = current.next;
        }
    }
    public LinkClass find(int key){
        LinkClass current = first;
        while(current!=null){
            if(current.id==key){
                return current;
            }else{
                current = current.next;
            }
        }
        return null;
    }

    public void insertFirst(int newData){
       LinkClass newLink = new LinkClass(newData);
       newLink.next = first;
       first = newLink;
    }

    public LinkClass deleteFirst(){
        LinkClass temp = first;
        first = first.next;
        return temp;
    }

    public boolean deleteAfter(int key){
        LinkClass current = first;
        LinkClass previous = first;
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
        LinkClass current = first;
        LinkClass previous = first;
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

    public boolean insertAfter(int key,int newData){
        LinkClass current = first;
        LinkClass newLink = new LinkClass(newData);
        while(current!=null){
            if(current.id==key){
                newLink.next = current.next;
                current.next = newLink;
                return true;
            }else{
                current = current.next;
            }
        }
        return false;
    }
}


class mainClass{
    public static void main(String[] args){
        LinkedListClass links = new LinkedListClass();
        Scanner scanner = new Scanner(System.in);
        for(int counter=0;counter<5;counter++){
             links.insertFirst(scanner.nextInt());
        }

        if(links.insertAfter(10, 20)){
             links.displayLinkList();
        }

        if(links.delete(10)){
            links.displayLinkList();
        }

        scanner.close();

    }
   

}