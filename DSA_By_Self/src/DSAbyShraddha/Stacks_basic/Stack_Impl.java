package DSAbyShraddha.Stacks_basic;


import java.util.Objects;
import java.util.Stack;

class stack_basics{



    public static void Traverse_In_Stack(Stack<Integer> stack){


        for (int num: stack){

            System.out.println(num);
        }
    }
    public static void Copying_the_stack(Stack<Integer> stack){

        Stack<Integer> newStack= new Stack<>();


        while (stack.size()>0){

            int top = stack.pop();

            newStack.push(top);
            System.out.println(newStack);

        }

        while (stack.size()>0){

            stack.push(newStack.pop());
        }


    }



}

public class Stack_Impl {

    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

//        System.out.println(stack.peek());
//
//        stack.pop();
//        System.out.println(stack.peek());
//        System.out.println(stack.size());
//        System.out.println(stack);



//        stack_basics.Traverse_In_Stack(stack);
        stack_basics.Copying_the_stack(stack);


    }
}
