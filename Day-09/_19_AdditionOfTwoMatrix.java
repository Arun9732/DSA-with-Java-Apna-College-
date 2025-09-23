public class _19_AdditionOfTwoMatrix {
  public static void main(String[] args) {
    int a[][]={{1,2},{3,4}};
    int b[][]={{5,6},{7,8}};
    int m=a.length;
    int n=b[0].length;
    int c[][]=new int [m][n];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        c[i][j]=a[i][j]+b[i][j];
      }
    }
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        System.out.print(c[i][j]+" ");
      }
      System.out.println();
    }
    

  }
}
