package PACKAGE_NAME.Leetcode;

public class SetMatrix {
    public static void main(String[] args) {
      int[][] arr = {
              {1,1,1},
              {1,0,1},
              {1,1,1}
      };

      SetZeros(arr);
      printArray(arr);
    }
    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[] zeroRow = new boolean[row];
        boolean[] zeroCol = new boolean[col];

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (matrix[i][j]==0){
                    zeroRow[i]=true;
                    zeroCol[j] = true;
                }
            }
        }
        for (int i=0;i<row;i++){
            if (zeroRow[i]){
                for (int j=0;j<col;j++){
                    matrix[i][j]=-1;
                }
            }
        }
        for (int j=0;j<row;j++){
            if (zeroCol[j]){
                for (int i=0;i<col;i++){
                    matrix[i][j] = -1;
                }
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (matrix[i][j]==-1){
                    matrix[i][j] = 0;
                }
            }
        }

    }
    public static void printArray(int[][] arr){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void SetZeros(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] matrix2 = new int[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matrix[i][j] = matrix2[i][j];
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (matrix2[i][j]==0){
                    for (int k=0;k<row;k++){
                        matrix2[i][k] = 0;
                    }
                    for (int k=0;k<col;k++){
                        matrix2[col][j] = 0;
                    }
                }
            }
        }
    }
}
