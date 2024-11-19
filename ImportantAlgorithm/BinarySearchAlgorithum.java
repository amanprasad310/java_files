package ImportantAlgorithm;


public class BinarySearchAlgorithum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(BinarySearch(arr,0,arr.length-1,6));
        
    }
    
    public static int BinarySearch(int[] arr,int start,int end,int target){
        while(start<=end){
            // int mid = (start+end)/2;
            int mid =  start + (end -start)/2;//in case if start+end exceed the value of int 

            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                
                end = mid -1;
            }
            if(arr[mid]<target){
                start = mid +1;
            }
        }
        return -1;
    }
}