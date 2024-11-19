package ImportantAlgorithm;

import java.util.Arrays;

public class BSin2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        System.out.println(Arrays.toString(searching(arr, 8)));
    }

    public static int[] searching(int [][] matrix,int target){
        int r = 0;
        int c = matrix.length - 1;

        while(r < matrix.length && c >= 0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            if(matrix[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
