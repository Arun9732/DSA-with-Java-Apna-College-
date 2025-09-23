public class _18_SearchInMatrix {
  public static boolean SearchinMatrix(int mat[][],int key){
    int row=0;                                    
     //This code by ysing the row major use [(0,m-1)] condition ke according also we use[(n-1,0)] condition called coloumn major
  
    int col=mat[0].length-1;
    while(row<mat.length&&col>=0){
      // loop jb hmara key equal aa jaye
      if(mat[row][col]==key){
        System.out.print("("+row+","+col+")");
        return true;
      }
      // jb key chota hoga to left khisk jao mtlb col ki value km kr do
      else if(key<mat[row][col]){
        col--;
      }
      // agr jada hai to row ko niche le aao mtlb 0 se 1 tk le aao
      else{
        row++;
      }
    }
    System.out.print("Not Found");
    return false;
  }

  public static void main(String[] args) {
    int mat[][]={{10,20,30,40},
                 {15,25,35,45},
                 {27,29,37,48},
                 {32,33,39,50}};
                 int key=11;
      SearchinMatrix(mat,key);
  }  
}
