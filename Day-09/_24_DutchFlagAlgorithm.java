//Method---1
public class _24_DutchFlagAlgorithm {
  public static void main(String[] args) {
    int arr[]={0,1,2,0,1,2,0,0};
    int n=arr.length;
    int l=0,hi=n-1,mid=0;
    while(mid<=hi){
      if(arr[mid]==0){
        int temp=arr[mid];
        arr[mid]=arr[l];
        arr[l]=temp;
        l++;
        mid++;      
      }

      else if(arr[mid]==1){
        mid++;
      }
      else{
        int temp=arr[mid];
        arr[mid]=arr[hi];
        arr[hi]=temp;
        hi--;
      }
    }
    for(int ele:arr){
      System.out.print(ele+ " ");
    }
  }
  
}
