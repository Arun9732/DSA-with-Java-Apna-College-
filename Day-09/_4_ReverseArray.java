import java.util.Arrays;

public class _4_ReverseArray {
  public static void reverseArray(int arr[]) {
    int last = arr.length - 1;
    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[last - i];
      arr[last - i] = temp;
    }
  }

  public static void main(String[] args) {
    int arr[] = {2, 4, 6, 8, 10};
    System.out.println("Array before Reverse: " + Arrays.toString(arr));
    reverseArray(arr); // No need to return anything
    System.out.println("Array after Reverse: " + Arrays.toString(arr));
  }
}