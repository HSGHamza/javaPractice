public class sort {
    public static void main(String[] args) {
        int arr[] = {16,49,3,12,25};
        
       
        for(int i = 0; i<arr.length; i++){
            for (int j = 1; j<arr.length; j++){
                int cur = arr[j];
                int prev = arr[j-1];
                System.out.println("curr=" + cur);
                System.out.println("prev =" + prev);
                
                if (prev > cur){
                    arr[j-1] = cur;
                    arr[j] = prev  ;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }




    }
}
