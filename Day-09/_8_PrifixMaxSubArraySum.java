public class _8_PrifixMaxSubArraySum {
  public static void prifixSubarraySum(int arr[]){
    int currSum=0;
    int max=Integer.MIN_VALUE;
    int pri[]=new int[arr.length];
    pri[0]=arr[0];
    for(int i=1;i<pri.length;i++){
      pri[i]=arr[i]+pri[i-1];
    }
    for(int i=0;i<arr.length;i++){
      for(int j=i;j<arr.length;j++){
        currSum=i==0?pri[j]:pri[j]-pri[i-1];       
        if(max<currSum){
          max=currSum;
        }        
      }
    }
    System.out.println("max sum of SubArray:"+max);
  }

  public static void main(String[] args) {
    int arr[] = { 2,4,6,8,10};
    prifixSubarraySum(arr);

  }

}
