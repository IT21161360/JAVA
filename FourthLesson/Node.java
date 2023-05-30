package FourthLesson;

import java.util.Scanner;

public class Node {
    
    public int iData;
    public double dData;
    public Node leftChild;
    public Node rightChild;

    public Node(){

    }

    public void displayNode(){
        System.out.println(iData);
        System.out.println(dData);
    }


}

class Tree{

    public Node root;
    public Tree(){
        root = null;
    }

    public Node minimum(){
        Node current = root;
        while(current.leftChild!=null){
            current = current.leftChild;
        }
        return current;
    }

    public Node maximum(){
        Node current = root;
        while(current.rightChild!=null){
            current = current.rightChild;
        }
        return current;
    }

    private void descendingOrder(Node localRoot){
         if(localRoot!=null){
            descendingOrder(localRoot.rightChild);
            localRoot.displayNode();
            descendingOrder(localRoot.leftChild);
         }
    }

    public void descendingOrder(){
        descendingOrder(root);
    }


    public Node find(int key){
        Node current = root;
        while(current.iData!=key){
            if(key<current.iData){
                current = current.leftChild;
            }else{
                current = current.rightChild;
            }if(current==null){
                return null;
            }
        }
        return current;
    }

    public void insert(int id,double dd){

        Node node = new Node();
        node.dData = dd;
        node.iData = id;

        if(root==null){
            root = node;
        }else{
        Node current = root;
        Node previous = root;

        while(true){
            previous = current;
            if(id<current.iData){
                current = current.leftChild;
                if(current==null){
                previous.leftChild = node;
                return;
               }
            }
            else{
                current = current.rightChild;
                if(current==null){
                previous.rightChild = node;
                return;
            }
        }

    }
  }
}
}

class Main{
    public static void main(String[] arrs){
        Tree tree = new Tree();
        Scanner sc = new Scanner(System.in);
        for(int counter=1;counter<=10;counter++){
            tree.insert(sc.nextInt(),sc.nextDouble());
        }

        Node tallest = tree.maximum();
        System.out.println(tallest.iData);
      
        Node smallest = tree.minimum();
        System.out.println(smallest.iData);

        tree.descendingOrder();

        sc.close();
    }
}
