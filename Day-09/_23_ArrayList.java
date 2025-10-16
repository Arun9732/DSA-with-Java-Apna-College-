import java.util.ArrayList;
public class _23_ArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> arr=new ArrayList<>();
    arr.add(90);
    System.out.println(arr+" "+arr.size());
     arr.add(20);
    System.out.println(arr+" "+arr.size());
     arr.add(30);
    System.out.println(arr+" "+arr.size());
     arr.add(50);
    System.out.println(arr+" "+arr.size());
    arr.set(3,37);
    System.out.println(arr+" "+arr.size());
  }
  
}
