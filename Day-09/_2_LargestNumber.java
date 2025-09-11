public class _2_LargestNumber {
  public static void largestNumber(int arr[]){
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      if(max<arr[i]){
        max=arr[i];
      }
    }
    System.out.print("Maximum value in array:"+max);    
  }

  public static void main(String[] args) {
    int arr[]={22,54,67,89,44,56,98};
    largestNumber(arr);
    
  }
  
}
