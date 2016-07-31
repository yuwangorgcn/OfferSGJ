package cn.org.yuwang.sort;

/**
 * Created by m1500 on 2016/7/31.
 */
public class SelectionSort {
    int minN;
    int temp;
    public int [] sort(int nums[]){
        for(int i=0;i<nums.length;i++){
            minN=i;
            for(int j=i+1;j<nums.length;j++){
                if (nums[j]<nums[minN]){
                    minN=j;
                }
            }
            if (minN!=i){
                temp=nums[i];
                nums[i]=nums[minN];
                nums[minN]=temp;
            }
        }

        return nums;
    }
}
