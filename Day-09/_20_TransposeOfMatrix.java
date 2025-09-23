public class _20_TransposeOfMatrix {
  //Transpose kr rha hu by createing new matrix {bina new matrix bnaye bhi kr sktye hai[bus coloumn mia print kra do]}
  public static void TransposeMatric(int mat[][]){
    int m=mat.length;
    int n=mat[0].length;
    int trans[][]=new int [n][m];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        trans[j][i]=mat[i][j];
      }
    }

    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        System.out.print(trans[i][j]+" ");
      }
      System.out.println();
    }


  }

  public static void main(String[] args) {
    int mat[][]={{1,2,3},{4,5,6}};
    TransposeMatric(mat);

  }
  
}
