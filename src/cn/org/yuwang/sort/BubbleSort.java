package cn.org.yuwang.sort;

/**
 * Created by m1500 on 2016/7/31.
 */
public class BubbleSort {
    public int [] sort(int [] nums){
        int temp;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}
