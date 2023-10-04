public class Sorting {
    public static void main(String[] args) {
    int[] arr = {1 ,2 ,3 ,5 ,6};


        //bubble sort
        for (int i = 0; i<arr.length-1; i++){
            for (int m = 0; m<arr.length-1-i; m++){
                if (arr[m] > arr[m+1]){
                    int temp = arr[m];
                    arr[m] = arr[m+1];
                    arr[m+1] = temp;
                }
            }
        }


        //selection sort
        for (int i = 0; i<arr.length-1; i++){
            int smallest = i;
            for (int m = i + 1; m<arr.length; m++){    
                if (arr[smallest] > arr[m]){
                    smallest = m;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }


        //insertion sort
        for (int i = 1; i<arr.length; i++){
            int current = arr[i];
            int m = i-1;
            while (m>=0 && current < arr[m]){
                arr[m + 1] = arr[m];
                m--;
            }
            arr[m+1] = current;
        }










































    }
    
}
