package sort;
//排序类型	平均情况	最好情况	最坏情况	辅助空间	稳定性
//折半插入排序	O(n²)	 O(n)	       O(n²)	O(1)	稳定
public class InsertSort {
    public void insertSort(int[] arr){
        if(arr==null||arr.length<=1) return;;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j >0 ; j--) {
                if(arr[j]>arr[j-1]) break;
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
    }
}
