import java.util.*;

public class _1_LinearSearch {
  public static void linearSearch(int arr[], int n) {
    boolean t = true;
    for (int i = 0; i < arr.length; i++) {
      if (n == arr[i]) {
        System.out.print("Index of Number: " + i+"\n");
        t = false;
        break;
      }   
    }
     if (t == true) {
      System.out.println("Element Not Present");
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number to Search: ");
    int n = sc.nextInt();
    int arr[] = { 22, 33, 43, 66, 87, 23 };
    linearSearch(arr, n);
  }

}
