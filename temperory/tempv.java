public class tempv {
    public static void main(String[] args) {
        int[] arr = {6,7,1,2,3,4,5};
        int result = searchNumberOfRotation(arr); 
        if(result == -1){
            System.out.println(0);
        }else{
        System.out.println(result+1);}
    }
    public static int searchNumberOfRotation(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] > arr[start]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1; 
    }
}
