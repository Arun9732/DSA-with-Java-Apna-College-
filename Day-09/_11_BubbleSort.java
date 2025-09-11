public class _11_BubbleSort {
  public static void bubbleSort(int arr[]){
    int temp;
    int n=arr.length;
    for(int i=0;i<n-1;i++){
      for(int j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
          temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }


  }

  public static void main(String[] args) {
    int arr[]={5,6,1,3};
    bubbleSort(arr);

  }
  
}
