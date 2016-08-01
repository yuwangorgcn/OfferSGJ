package cn.org.yuwang.JzOffer;

import java.util.Stack;

/**
 * Created by wuy on 2016/8/1.
 */
public class 用两个栈实现队列 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (!stack2.empty())
            return stack2.pop();
        while (!stack1.empty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
