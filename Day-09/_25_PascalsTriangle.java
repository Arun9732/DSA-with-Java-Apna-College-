import java.util.*;
public class _25_PascalsTriangle {
  public static void main(String[] args) {
    int n=5;
    List<List<Integer>>a=new ArrayList<>();
    for(int i=0;i<n;i++){
      List<Integer>l=new ArrayList<>();
      for(int j=0;j<=i;j++){
        if(j==0 || j==i){
          l.add(1);
        }
        else{
          int x=a.get(i-1).get(j)+a.get(i-1).get(j-1);
          l.add(x);
        }
      }
      a.add(l);
    }
    for (List<Integer> row : a) {
      System.out.println(row);
    }
  }  
}
