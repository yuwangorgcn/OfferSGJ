package cn.org.yuwang.sort;

/**
 * Created by m1500 on 2016/7/31.
 */
public class MergeSort {
    public int [] sort(int [] nums,int low,int high){
        int mid=(low+high)/2;
        if(low<high){
                sort(nums,low,mid);
                sort(nums,mid+1,high);
                merge(nums,low,mid,high);
        }
        return nums;
    }
    public void merge(int [] nums,int low ,int mid,int high){
        int [] temp=new int[high-low+1];
        int lowN=low;
        int highN=mid+1;
        int i=0;
        while (lowN<=mid && highN<=high){
            if(nums[lowN]<nums[highN]){
                temp[i++]=nums[lowN++];
            }else {
                temp[i++]=nums[highN++];
            }
        } 
        while (lowN<=mid){
            temp[i++]=nums[lowN++];
        }
        while (highN<=high){
            temp[i++]=nums[highN++];
        }
        for(int j=0;j<i;j++){
            nums[low+j]=temp[j];
        }
    }
}
