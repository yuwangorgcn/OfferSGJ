package cn.org.yuwang.JzOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by wuy on 2016/8/1.
 */
public class 从尾到头打印链表 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list =new ArrayList<Integer>();
        Stack<Integer> stack=new Stack<Integer>();
        while (listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        int n=stack.size();
        for(int i=0;i<n;i++){
            list.add(stack.pop());
        }
        return list;
    }
}
 
