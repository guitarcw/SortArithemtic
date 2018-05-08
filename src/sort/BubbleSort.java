package sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] test={4,2,1,6,4,3,4,12,5,19};
        bubbleSort(test);
        for(int i:test){
            System.out.println(i);
        }
    }
    public static void bubbleSort(int[] arr){
        if(arr==null||arr.length<=1) return;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >=i+1 ; j--) {
                if(arr[j]<=arr[j-1]) continue;
                else {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
