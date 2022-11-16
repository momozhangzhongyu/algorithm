package com.data.stack;

public class StackTest {
    public static void main(String[] args) {
        LinkStack<Integer> stack = new LinkStack<>();
        for(int i = 0; i < 10; i++){
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
//        System.out.println(stack);
    }
}
