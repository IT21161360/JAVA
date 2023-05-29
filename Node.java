public class Node{

    public int iData;
    public double dData;
    public Node leftChild;
    public Node rightChild;
    public Node(){

    }
    public void displayNode(){
        System.out.println(iData+dData);
    }

   
}

class Tree{

    private Node root;
    public Tree(){
        root = null;
    }

    private void Inorder(Node localRoot){
        if(localRoot!=null){
            Inorder(localRoot.leftChild);
            localRoot.displayNode();
            Inorder(localRoot.rightChild);
        }
    }

    private void preOrder(Node localRoot){
         if(localRoot!=null){
            localRoot.displayNode();
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
         }
    }

    private void postorder(Node localRoot){
        if(localRoot!=null){
            postorder(localRoot.leftChild);
            postorder(localRoot.rightChild);
            localRoot.displayNode();;
        }
    }

    private void discendingorder(Node localRoot){
        
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

        node.iData = id;
        node.dData = dd;


        if (root==null){
            root = node;
        }else{

        Node current = root;
        Node previous = root;

        while(true){

            previous = current;

            if(id<current.dData){
                current = current.leftChild;
                if(current == null){
                    previous.leftChild = node;
                    return;
               }
            }else{
                current = current.rightChild;
                if(current == null){
                    previous.rightChild = node;
                    return;
               }
            }
        }
    }
}

}