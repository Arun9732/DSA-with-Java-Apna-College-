public class _15_MergeSort {
  public static void mergeSort(int arr[], int si, int ei) {
    if (si >= ei) {
      return;
    }
    int mid = (si + ei) / 2;
    mergeSort(arr, si, mid);
    mergeSort(arr, mid + 1, ei);
    merge(arr, si, mid, ei);
  }

  public static void merge(int arr[], int si, int mid, int ei) {
    int n1 = mid - si + 1;
    int n2 = ei - mid;

    int[] left = new int[n1];
    int[] right = new int[n2];

    for (int i = 0; i < n1; i++)
      left[i] = arr[si + i];
    for (int j = 0; j < n2; j++)
      right[j] = arr[mid + 1 + j];

    int i = 0, j = 0, k = si;
    while (i < n1 && j < n2) {
      if (left[i] <= right[j]) {
        arr[k++] = left[i++];
      } else {
        arr[k++] = right[j++];
      }
    }

    while (i < n1) {
      arr[k++] = left[i++];
    }

    while (j < n2) {
      arr[k++] = right[j++];
    }
  }

  public static void main(String[] args) {
    int arr[] = {2, 5, 7, 3, 1, 8};
    mergeSort(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}