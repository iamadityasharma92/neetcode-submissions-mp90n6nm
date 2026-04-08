class NumMatrix {
    int[][] matrix;
    int[][] arr;

    public NumMatrix(int[][] matrix) {
      this.matrix = matrix;
      int n=matrix.length;
      int m=matrix[0].length;
      // this needs to be done by prefix sum -> calculate prefix sum of rows and then while being called for sum 
    //   give values from prefix sum array rather than calculating from array everytime
    this.arr=new int[n+1][m+1];

    // calculate prefix sums and store 
    for(int i=0;i<n;i++){
        arr[i][0]=matrix[i][0];
        for(int j=1;j<m;j++){
            
            arr[i][j]=arr[i][j-1]+matrix[i][j];
            // System.out.print(matrix[i][j]+" ");
        }
    }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0;
        for(int i=row1;i<=row2;i++){
            if(col1>0)
        sum += (arr[i][col2]-arr[i][col1-1]);
        else
        sum+=arr[i][col2];
        }
        return sum;
    }
}