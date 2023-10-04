public class jjk3 {
    public static void main(String[] args) {
        int[] arr = { 1 ,33, 22,31,55};
        selectionSort(arr);
        display(arr);
        
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void display(int arr[]){
        for(int e : arr){
            System.out.print(e + " ");
        }
    }

}
