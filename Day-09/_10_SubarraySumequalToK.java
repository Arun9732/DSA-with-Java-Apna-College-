public class _10_SubarraySumequalToK {
   public static void SubArraySum(int arr[],int k){
   int count=0;
    for(int i=0;i<arr.length;i++){
       int currSum=0;
      for(int j=i;j<arr.length;j++){
        currSum=currSum+arr[j];
        if(currSum==k){
          count++;
        }       
      }
    }
    if(count==k){
      System.out.println(count);
    }
    else{
      System.out.println("0");
    }
  }

  public static void main(String[] args) {
      int arr[]={1,2,3};
      int k=3;
      SubArraySum(arr,k);


    }
}