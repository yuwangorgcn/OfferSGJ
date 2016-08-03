package cn.org.yuwang.JzOffer;

/**
 * Created by m1500 on 2016/8/3.
 */
public class 数值的整数次方 {
    public double Power(double base, int exponent) {
        if(exponent==0)
            return (double)1;
        double ans=base;
        for(int i=1;i<Math.abs(exponent);i++){
            ans*=base;
        }

        if(exponent>0)
            return ans;

        else
            return 1/ans;

    }
}
