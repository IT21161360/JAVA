package Lec3;

public class Link {

    public int iData;
    public Link next;
    public Link(int s){
        iData = s;
        next = null;
    }
    public void displayLink(){
        System.out.println(iData);
    }
    
}
