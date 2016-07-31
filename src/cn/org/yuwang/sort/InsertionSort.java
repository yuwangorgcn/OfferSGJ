package cn.org.yuwang.sort;

/**
 * Created by m1500 on 2016/7/31.
 */
public class InsertionSort {
    public int[] sort(int nums[]){
        int key;
        int j;
        for(int i=1;i<nums.length;i++){
            key=nums[i];
            j=i-1;
            while (j>=0&&key<nums[j]){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }
        return nums;
    }
}
/**/
