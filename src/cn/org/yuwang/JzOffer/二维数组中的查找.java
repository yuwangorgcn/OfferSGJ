package cn.org.yuwang.JzOffer;

/**
 * Created by m1500 on 2016/7/31.
 */
public class 二维数组中的查找 {
    public boolean Find(int [][] array,int target) {
        int row=0;
        int col=array[0].length-1;
        while (row<array.length&&col>=0){
            if(array[row][col]>target){
                col--;
            }else if (array[row][col]<target){
                row++;
            }else {
                return true;
            }
        }
        return false;
    }
}

