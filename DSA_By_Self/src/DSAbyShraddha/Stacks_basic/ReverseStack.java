package DSAbyShraddha.Stacks_basic;

import java.util.Stack;

public class ReverseStack {

    public static void PrintBottom(Stack<Integer> stack,int data){
        if (stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top=stack.pop();
        PrintBottom(stack,data);
        stack.push(top);

    }

    public static void Reverse(Stack<Integer> stack){

        if (stack.isEmpty()){
            return;
        }
        System.out.println(stack.pop());
        Reverse(stack);

        
    }
    public static void main(String[] args) {

        Stack<Integer> stack= new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        PrintBottom(stack,6);

        System.out.println(stack);


    }
}
