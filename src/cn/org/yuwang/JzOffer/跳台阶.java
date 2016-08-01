package cn.org.yuwang.JzOffer;

/**
 * Created by wuy on 2016/8/1.
 */
public class 跳台阶 {
    public int JumpFloor(int target) {
        if(target==0||target==1||target==2){
            return target;
        }
        int Fn=0;
        int Fn_1=2;
        int Fn_2=1;
        for(int i=3;i<=target;i++){
            Fn=Fn_1+Fn_2;
            Fn_2=Fn_1;
            Fn_1=Fn;
        }
        return Fn;
    }
}
