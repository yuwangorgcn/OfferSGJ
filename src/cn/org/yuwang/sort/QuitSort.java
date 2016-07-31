package cn.org.yuwang.sort;
/**
 * Created by m1500 on 2016/7/31.
 */
public class QuitSort {
    public int [] sort(int[] nums,int left,int right){
        if(left>=right){
            return nums;
        }
        int low=left;
        int high=right;
        int key=nums[left];
        while (low<high){
            while (low<high && nums[high]>=key){
                high--;
            }
            nums[low]=nums[high];
            while (low<high && nums[low]<key){
                low++;
            }
            nums[high]=nums[low];
        }
        nums[low]=key;
        sort(nums,left,low-1);
        sort(nums,low+1,right);
        return nums;
    }
}
