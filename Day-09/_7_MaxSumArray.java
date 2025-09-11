public class _7_MaxSumArray {
  public static void MaxSubArray(int arr[]){
    int currSum=0;
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      for(int j=i;j<arr.length;j++){
        currSum=0;
        for(int k=i;k<=j;k++){
          currSum=currSum+arr[k];          
        }
        System.out.print(currSum+" ");
        if(max<currSum){
          max=currSum;
        }
        
      }
    }
    System.out.println("Max Sum of sub array:"+max);
  }

  public static void main(String[] args) {
    int arr[]={2,4,6,8,10};
    MaxSubArray(arr);
  }
  
}
