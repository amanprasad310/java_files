// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Scanner;

public class Code12 {
    public static void main(String[] args){
        //syntax for array
        // datatype[] variable = new datatype[size];

        //example
        // int[] arr = new int[5];
        // int[] arr = {1,2,3,4,5};
        // Int[][] arr2 = new int[necessary][not necessary] || {{1,2},{3,4}};
        // Array.toString(arr);
        //arr[i] = in.nextInt();

        //ArrayList

        //Syntax

        //ArrayList<Integer> list = new ArrayList<>();

        // list.add(x);
        // list.contain(x);
        // list.set(i,x);
        // list.remove(i);
        // list.add(in.nextInt());

        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // int size = 10;
        // int size2 =5;

        //initialisation
        //for(int i=0;i<size;i++){
        //      list.add(new ArrayList<>());
        // }
        //

        //add element

        // for(int i=0;i<size;i++){
        //     for(int j=0;j<size2;j++){
        //         list.get(i).add(in.nextInt);
        //     }
        // }








        // question 

        //reverse an array

        int[] arr = {1,2,3,4,5};
        // Scanner in = new Scanner(System.in);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr ,int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
