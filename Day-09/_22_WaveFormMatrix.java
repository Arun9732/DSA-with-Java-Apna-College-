public class _22_WaveFormMatrix {
  public static void WaveForm(int mat[][]){
    int m=mat.length;
    int n=mat[0].length;
    for(int i=0;i<m;i++){
      if(i%2==0){
        for(int j=0;j<n;j++){
          System.out.print(mat[i][j]+" ");
        }
      }
        else{
          for(int j=n-1;j>0;j--){
            System.out.print(mat[i][j]+" ");
          }
        }
      }
    }


  public static void main(String[] args) {
    int mat[][] = { { 10, 20, 30, 40 },
        { 15, 25, 35, 45 },
        { 27, 29, 37, 48 },
        { 32, 33, 39, 50 } };
    WaveForm(mat);
  }

}
