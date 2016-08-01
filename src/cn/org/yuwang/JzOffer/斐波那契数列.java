package cn.org.yuwang.JzOffer;

/**
 * Created by wuy on 2016/8/1.
 */
public class 斐波那契数列 {
    public int Fibonacci(int n) {
        if(n==0||n==1){
            return n;
        }
        int Fn=0;
        int Fn_1=1;
        int Fn_2=0;
        for(int i=2;i<=n;i++){
            Fn=Fn_1+Fn_2;
            Fn_2=Fn_1;
            Fn_1=Fn;
        }
        return Fn;
    }
}
