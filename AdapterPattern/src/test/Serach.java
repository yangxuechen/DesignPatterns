package test;

public class Serach {

    //二分查找
    public int search(int nums[],int key){
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]==key){
                return 1;
            }else if(nums[mid]>key){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
}
