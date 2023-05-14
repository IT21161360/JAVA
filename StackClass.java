class StackClass{
    private char stackArray[];
    private int maxSize;
    private int top;

    public StackClass(int size){
        size = maxSize;
        top = -1;
        stackArray = new char[maxSize];
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if(top==maxSize-1){
            return true;
        }else{
            return false;
        }
    }

    public void push(char increment){
        if(top==maxSize-1){
            System.out.println("The stack is full");
        }else{
            stackArray[++top] = increment;    
        }
    }

    public int pop(){
        if(top==-1){
            System.out.println("The stack is empty");
            return -99;
        }else{
            return stackArray[top--];
        }
    }

    public int peek(){
        if(top==-1){
            System.out.println("The stack is empty");
            return -99;
        }else{
            return stackArray[top];
        }
    }
}

class StackMainClass{
    public static void main(String[] args){
        StackClass stack = new StackClass(5);
        stack.push('d');
        stack.push('e');
        stack.push('w');
        stack.push('m');
        stack.push('i');

        System.out.println(stack.peek());

        while(!stack.isEmpty()){
            //imwed
            System.out.println(stack.pop());
        }

    
           
        }

   


}