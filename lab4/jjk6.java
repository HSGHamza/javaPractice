public class jjk6 {
    public static void main(String[] args) {
     int[] arr  = {1, 3, 4, 5, 6};
        larr(arr, 0, 0);
    }

   public static void larr(int[] arr , int large , int s){
        if(s < arr.length){
            if (arr[s] > large){
                large = arr[s];
            }
            larr(arr, large, s+1);
        }else{
            System.out.println(large);
        }
        
       
    } 
}