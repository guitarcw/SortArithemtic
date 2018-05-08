package sort;

public class QuickSort {
        public static void quickSort(int[] nums,int left,int right){
            if (nums==null) return;
            if (left>=right) return;
            int indexL=left;
            int indexR=right;
            int pos=nums[left];
            while (indexL<indexR){
                while (nums[indexR]>=pos&&indexR>indexL) indexR--;//这一步决定重合的位置肯定是大于或等于nums[left]
                while (nums[indexL]<=pos&&indexL<indexR) indexL++;
                swap(nums,indexL,indexR);
            }
            swap(nums,left,indexL);
            quickSort(nums,left,indexL-1);
            quickSort(nums,indexL+1,right);
        }
        private static void swap(int[] nums,int index1,int index2){
            int temp=nums[index1];
            nums[index1]=nums[index2];
            nums[index2]=temp;
        }
        public static void main(String[] args) {
            int[] x={14,11,2,4,2,3,3,10,13};
            quickSort(x,0,x.length-1);
            for (int i = 0; i <x.length ; i++) {
                System.out.println(x[i]);
            }
        }

}
