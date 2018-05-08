package sort;

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
