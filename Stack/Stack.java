package Stack;

public class Stack {

    private  int stackArray[] ;
    private int top;
    private int maxSize;
    public Stack(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top=-1;
    }
    public void push(int increment){
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
            return stackArray[top--] ;
        }
    }

    public int peek(){
        if(top==-1){
            System.out.println("The stack is empty");
            return -99;
        }else{
            return stackArray[top] ;
        }
    }

    public boolean isEmpty(){
        if(top==-1){
            System.out.println("The stack is empty");
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(top==maxSize-1){
            System.out.println("The stack is full");
            return true;
        }else{
            return false;
        }
    }

}


class Main{
    public static void main(String[] args){
        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}


