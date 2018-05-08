package sort;

public class MergeSort {

    public void mergeSort(int[] nums,int[] temp,int left,int right){
        if (left>=right) return;
        int middle=(left+right)/2;
        mergeSort(nums,temp,left,middle);
        mergeSort(nums,temp,middle+1,right);
        merge(nums,temp,left,middle,right);

    }
    private void merge(int[] nums,int[] temp,int left,int middle,int right){
        int rightStart=middle+1;
        int tmpPos=left;
        int numElements=right-left+1;
        while (left<=middle&&rightStart<=right){
            if(nums[left]<nums[rightStart]){
                temp[tmpPos++]=nums[left++];
            }
            else
                temp[tmpPos++]=nums[rightStart++];
        }
        while (left<=middle){
            temp[tmpPos++]=nums[left++];
        }
        while (rightStart<=right)
            temp[tmpPos++]=nums[left++];
        for (int i = 0; i <numElements ; i++,right--) {
            nums[right]=temp[right];
        }
    }
}
