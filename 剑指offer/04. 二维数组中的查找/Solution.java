class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length<1)return false;
        if(matrix[0].length<1)return false;
        int width=matrix[0].length-1;
        int high=0;
        while(high<=matrix.length-1&&width>=0){
            if(target<matrix[high][width]){
                width--;
                continue;
            }
            else if(target>matrix[high][width]){
                high++;
                continue;
            }
            else{
                return true;
            }
        }
        return false;
    }
}