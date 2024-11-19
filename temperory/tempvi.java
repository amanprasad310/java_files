import java.util.ArrayList;

public class tempvi {
    public static void main(String[] args) {
        int[] arr1 = {1,3,0,5,8,5};
        int[] arr2 = {2,4,6,7,9,9};
        int newStart=arr1[0];
        int newEnd=arr2[0];

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        for(int i=1;i<arr1.length;i++){
            if(newEnd < arr1[i]){
                arr.add(i);
                newStart = arr1[i];
                newEnd = arr2[i];
            }
        }
        for(int i: arr){
            System.out.println(i);
        }
    }
}
