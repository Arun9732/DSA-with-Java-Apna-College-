public class _13_InsertionSort {
  public static void insertionSortint(int arr[]){
    for(int i=1;i<arr.length;i++){
      int key=arr[i];
      int j=i-1;
      while(j>=0&&arr[j]>key){
        arr[j+1]=arr[j];
        j--;
      }
      arr[j+1]=key;
    }
    for(int i:arr){
      System.out.print(i+" ");
    }

  }

  public static void main(String[] args) {
    int arr[]={5,9,1,4,3};
    System.out.println("Before Sorting");
    for(int i:arr){
      System.out.print(i+" ");
    }
    System.out.println();
    System.out.println("After sorting");
    insertionSortint(arr);
  }
  
}
