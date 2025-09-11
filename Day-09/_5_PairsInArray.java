public class _5_PairsInArray {
  public static void pairsInArray(int arr[]){
    for(int i=0;i<arr.length-1;i++){
      for(int j=i;j<arr.length-1;j++){
        System.out.print("("+arr[i]+","+arr[j]+")"+" ");
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    int arr[]={2,4,6,8,10};
    pairsInArray(arr);

  }
  
}
