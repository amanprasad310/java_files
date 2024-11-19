

public class Practice20Exam {
    
    public static void main(String[] args){
        //1.Write a program to sort an array using Bubble Sort.

        /*
        Scanner in = new Scanner(System.in);
        int size;
        size = in.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            int temp = in.nextInt();
            arr[i]=temp;
        }
        for(int i = 0 ; i < size -1  ;i++){
            for(int j = 0 ; j < size - i -1 ;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        */



        //2.Write a program to sort an array using Selection Sort.

        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < size;i++){
            list.add(in.nextInt());
        }
        for(int i=0 ;i<size ;i++){
            int minIndex = i;
            for(int j=i ;j<size ;j++){
                if(list.get(minIndex)>list.get(j)){
                    minIndex = j;
                }
            }
            int temp = list.get(minIndex);
            list.set(minIndex,list.get(i));
            list.set(i,temp);
        }
        System.out.println(list);
        */



        //3.Write a program to search an element using Binary Search.

        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < size ;i++ ){
            arr.add(in.nextInt());
        }
        Collections.sort(arr);\
        int target = in.nextInt();
        int result;
        int start = 0;
        int end = arr.size()-1;
        while(start<=end){
            int mid = start + (end -start)/2;
            if(arr.get(mid)==target){
                System.out.println("Found" + mid);
                return;
            }
            if(arr.get(mid)<target){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        System.out.println("not found");
        return;
        */


        //4. Write a program to implement a queue using an array.

        

        // Write a program to implement a stack using an array.
        // Write a program to check for balanced parentheses in an expression.
        // Write a program to find the missing number in an array.
        // Write a program to find the duplicate elements in an array.
        // Write a program to reverse an array in place.
        // Write a program to find the second largest number in an array.
        // Write a program to remove duplicates from a sorted array.
        // Write a program to rotate an array by k positions.
        // Write a program to merge two sorted arrays.
        // Write a program to find the intersection of two arrays.
        // Write a program to find the union of two arrays.
        // Write a program to find the sum of all elements in an array.
        // Write a program to find the frequency of elements in an array.
        // Write a program to check if a matrix is symmetric.
        // Write a program to transpose a matrix.
        // Write a program to multiply two matrices.
        // Write a program to check if a string is palindrome.
        // Write a program to remove vowels from a string.
        // Write a program to count the occurrence of each character in a string.
        // Write a program to reverse each word in a string.
        // Write a program to find the longest word in a sentence.
        // Write a program to check if two strings are anagrams.
        // Write a program to find the first non-repeated character in a string.
        // Write a program to remove duplicate characters from a string.
        // Write a program to convert a string to uppercase without using built-in functions.
        // Write a program to implement a simple calculator.
        // Write a program to implement a simple banking system with deposit and withdraw functionalities.
        // Write a program to implement a simple voting system.
        // Write a program to check if a number is prime using recursion.
        // Write a program to find the factorial of a number using recursion.
        // Write a program to find the GCD of two numbers using recursion.
        // Write a program to generate the Fibonacci series
    }
}
