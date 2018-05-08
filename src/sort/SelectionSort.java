package sort;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        if(arr==null||arr.length<=1) return;
        for (int i = 0; i < arr.length; i++) {
            int min=i;
            for (int j = i; j <arr.length; j++) {
                if(arr[j]<arr[min])
                    min=j;
            }
            if(min!=i){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }
}
