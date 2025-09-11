public class _14_QuickSort {

  public static int partition(int arr[], int si, int ei) {
    int pivot = arr[ei]; // Correct pivot
    int i = si - 1;

    for (int j = si; j < ei; j++) {
      if (arr[j] <= pivot) {
        i++;
        // Proper swap
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    // Place pivot at correct position
    int temp = arr[i + 1];
    arr[i + 1] = arr[ei];
    arr[ei] = temp;

    return i + 1;
  }

  public static void QuickSort(int arr[], int si, int ei) {
    if (si < ei) {
      int pi = partition(arr, si, ei);
      QuickSort(arr, si, pi - 1); // Left side
      QuickSort(arr, pi + 1, ei); // Right side
    }
  }

  public static void main(String[] args) {
    int arr[] = { 2, 5, 8, 3, 4 };
    QuickSort(arr, 0, arr.length - 1);

    // Print sorted array
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}