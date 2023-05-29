public class NodeClass {

    public int iData;
    public double dData;
    public NodeClass leftChild;
    public NodeClass rightChild;

    public NodeClass() {

    }

    public void displayNode() {
        System.out.println(iData + dData);
    }
}

class TreeClass {
    private NodeClass root;

    public TreeClass() {
        root = null;
    }

    public NodeClass find(int key) {
        NodeClass current = root;
        while (current.iData != key) {
            if (key < current.dData) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(int id,double dd){
        NodeClass newNode = new NodeClass();
        newNode.iData =id;
        newNode.dData =dd;


        if(root==null){
            root = newNode;
        }else{

        NodeClass previuos = root;
        NodeClass current = root;

          while(true){

               previuos = current;
               if(current.iData<id){
                  current = current.leftChild;
                  if(current==null){
                    previuos.leftChild = newNode;
                    return;
                  }
               }else{
                current = current.leftChild;
                if(current==null){
                  previuos.leftChild = newNode;
                  return;
               }
           
          }

        }
    }


}

}
