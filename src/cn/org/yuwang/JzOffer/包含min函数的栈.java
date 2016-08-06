package cn.org.yuwang.JzOffer;

import java.util.Stack;

/**
 * Created by m1500 on 2016/8/6.
 */
public class 包含min函数的栈 {
    Stack<Integer> st=new Stack<Integer>();
    Stack<Integer> minSt=new Stack<Integer>();
    public void push(int node) {
        st.push(node);
        if(minSt.empty()||minSt.peek()=>node)
        minSt.push(node);
    }
    public void pop() {
        st.pop();
        if(!minSt.empty()&&st.peek()==minSt.peek())
            minSt.pop();

    }
    public int top() {
        return st.peek();
    }

    public int min() {
        return minSt.peek();

    }
}
