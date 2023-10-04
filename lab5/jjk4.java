public class jjk4 {
    public static void main(String[] args) {
        int arr[] = { 1 , 33, 42 ,12 ,11};
        hybridSort(arr);
        display(arr);
    }
        public static void hybridSort(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                boolean flag = false;
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        flag = true;
                    }
                }
                if (!flag) {
                    break;
                }
            }
            
            // Selection Sort
            for (int i = 0; i < arr.length - 1; i++) {
                int min = i;
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] < arr[min]) {
                        min = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
            
            // Insertion Sort
            for (int i = 1; i < arr.length; i++) {
                int key = arr[i];
                int comp = i - 1;
                while (comp >= 0 && arr[comp] > key) {
                    arr[comp+1] = arr[comp];
                    comp--;
                }
                arr[comp+1] = key;
            }
        }
    public static void display(int arr[]){
        for(int e : arr){
            System.out.print(e + " ");
        }
    }
}
//I have compiled all the sort alogrithms together as I don't about time complexity I can't confirm its timeComplexity
