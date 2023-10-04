import java.util.Random;

public class jjk1 {
    
public static void main(String[] args) {
    Random rand = new Random();
    int arr[] = {rand.nextInt(100),rand.nextInt(100),rand.nextInt(100),rand.nextInt(100),rand.nextInt(100),rand.nextInt(100)};
    System.out.print("Unsorted array: ");
    display(arr);
    System.out.print("\nSorted array: ");
    selectionSort(arr);
    display(arr);
} 
    //can't calculate time complexity as it is not taught by the course instructor


    public static void bubbleSort(int[] arr){
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
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int comp = i-1;
            while(comp >= 0 && key < arr[comp]){
                arr[comp + 1] = arr[comp];
                comp--;
            } 
            arr[comp + 1] = key;
        }
        
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int min = i;
            for ( int j =i+1 ; j<arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }

    public static void display(int arr[]){
        for(int e : arr){
            System.out.print(e + " ");
        }
    }
}
