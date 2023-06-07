package Tree;

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

    private Node root;
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


    private void inOrder(Node localRoot){
        if(localRoot!=null){
            inOrder(localRoot.leftChild);
            localRoot.displayNode();
            inOrder(localRoot.rightChild);
        }
    }

    public void inOrder(){
        inOrder(root);
    }

    private void preOrder(Node localRoot){
        if(localRoot!=null){
            localRoot.displayNode();
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    public void preOrder(){
        preOrder(root);
    }


    private void postOrder(Node localRoot){
        if(localRoot!=null){
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            localRoot.displayNode();
        }
    }

    public void postOrder(){
        postOrder(root);
    }

    private void desecndingOrder(Node localRoot){
        if(localRoot!=null){
             desecndingOrder(localRoot.rightChild);
             localRoot.displayNode();
             desecndingOrder(localRoot.leftChild);
        }
    }

    public void desecndingOrder(){
        desecndingOrder(root);
    }

    public boolean find(int key){
        Node current = root;
        while(current.iData!=key){
            if(key<current.iData){
                current = current.leftChild;
               
            }else{
                current = current.rightChild;
               
            }if(current==null){
                return false;
            }
        }
        return true;

    }

    public void insert(int id,double dd){
         Node newNode = new Node();
         newNode.dData = dd;
         newNode.iData = id;
         if(root==null){
            root = newNode;
         }else{
            Node previous = root;
            Node current = root;
            while(true){
                previous = current;
                while(id<current.dData){
                    current = current.leftChild;
                    if(current==null){
                        previous.leftChild = newNode;
                        return;
                    }else{
                        current=current.rightChild;
                        if(current==null){
                            previous.rightChild = newNode;
                            return;
                        }
                    }
                }

            }
         }
    }
}
