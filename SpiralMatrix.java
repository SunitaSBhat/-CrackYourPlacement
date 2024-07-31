import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> set = new ArrayList<>();
        int left=0; int right=matrix[0].length-1; int top=0; int bottom=matrix.length-1;
        while(top<=bottom && left<=right){
         for(int i=left; i<=right; i++){
               set.add(matrix[top][i]);
              
            }
            top++;
           for (int i = top; i <= bottom; i++) {
                set.add(matrix[i][right]);
            }
            right--; // Move the right boundary left

            if (top <= bottom) {
                // Traverse from right to left along the bottom row
                for (int i = right; i >= left; i--) {
                    set.add(matrix[bottom][i]);
                }
                bottom--; // Move the bottom boundary up
            }

            if (left <= right) {
                // Traverse from bottom to top along the left column
                for (int i = bottom; i >= top; i--) {
                    set.add(matrix[i][left]);
                }
                left++; // Move the left boundary right
            }

        }
        return set;
    }
}