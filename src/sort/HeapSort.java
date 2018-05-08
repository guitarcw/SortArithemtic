package sort;
//排序类型	平均情况	最好情况	最坏情况	辅助空间	稳定性
//堆排序	O(nlog₂n)	O(nlog₂n)	O(nlog₂n)	O(1)	不稳定
public class HeapSort {
    public static void main(String[] args) {
        int[] test={4,2,1,6,4,3,4,12,5,19};
        heapSort(test);
        for(int i:test){
            System.out.println(i);
        }
    }
    public static void heapSort(int[] arr){
        if(arr==null||arr.length<=1) return;
        for (int i = arr.length-1; i >=0 ; i--) {
            max_heapify(arr,i);
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
        }
    }
    private static void max_heapify(int[] arr,int limit){
        if(limit<=0||arr.length<limit) return;
        int parentId=(limit-1)/2;
        for (; parentId >=0 ; parentId--) {
            if(parentId*2+1>limit)
                continue;
            int left=parentId*2+1;
            int right=(parentId*2+2)>limit?left:(parentId*2+2);
            int maxChildId=arr[left]>arr[right]?left:right;
            if(arr[parentId]<arr[maxChildId]){
                int temp=arr[parentId];
                arr[parentId]=arr[maxChildId];
                arr[maxChildId]=temp;
            }
        }
    }
}
