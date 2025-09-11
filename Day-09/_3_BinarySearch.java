public class _3_BinarySearch {
  public static int  binarySearch(int arr[],int k){
    int start=0;
    int end=arr.length;
    while(start<=end){
      int mid=(start+end)/2;
      if(arr[mid]==k){
        return mid;
      }
      if(arr[mid]<k){
        start=mid+1;
      }
      else{
        end=mid-1;
      }
    }
    return -1;

  }

  public static void main(String[] args) {
    int arr[]={10,20,30,40,50};
    int result=binarySearch(arr, 4);
    if(result==-1){
      System.out.println("key not Found:");
    }else{
      System.out.println("Your Number at index:"+result+"\n");
    }

  }
  
}
