package Stack;

public class Node {
    public int id;
    public double dd;
    public Node leftChild;
    public Node rightChild;
    public Node(){
    }

    public void displayNode(){
        System.out.println(id);
        System.out.println(dd);
    }
}

class Tree{

    private Node root;

    public Tree(){
        root = null;
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

    public Node minimum(){
        Node current = root;
        while(current.leftChild!=null){
             current = current.leftChild;
            
        }
        return current;
    }

    public Node maximumNode(){
        Node current = root;
        while(current.rightChild!=null){
             current = current.rightChild;
            
        }
        return current;
    }





    public Node find(int key){
        Node current = root;
        while(current.id!=key){
            if(key<current.id){
                current = current.leftChild;
            }else{
                current = current.rightChild;
            }
        }
      return null;
    }

    public void insert(int id,double dd){
        Node node = new Node();
        node.id = id;
        node.dd = dd;
        if(root==null){
            root = node;
        }else{
            Node current = root;
            Node previous = root;
            while(true){
                previous = current;
                if(id<current.id){
                    current = current.leftChild;
                    if(current==null){
                        previous.leftChild = node;
                        return;
                    }else{
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
}
