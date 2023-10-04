public class jjk2 {
    public static void main(String[] args) {
        int arr[] = {1,23,55,42,51};
        display(arr);
        bubbleSort(arr);
        System.out.print("\n");
        display(arr);
    }
    public static void bubbleSort(int[] arr){
        int a =0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                a++;
            }
        }
        if ( a == arr.length-1){
            return;
        }


        for(int i = 0; i < arr.length-1; i++){
            for (int j = 0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void display(int arr[]){
        for(int e : arr){
            System.out.print(e + " ");
        }
    }
}
