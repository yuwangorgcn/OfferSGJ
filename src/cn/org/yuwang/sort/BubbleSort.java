package cn.org.yuwang.sort;

/**
 * Created by m1500 on 2016/7/31.
 */
public class BubbleSort {
    public int [] sort(int [] nums){
        int temp;
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
}
