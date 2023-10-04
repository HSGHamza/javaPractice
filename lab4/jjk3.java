public class jjk3 {
    public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5};
    recursive a = new recursive();
    a.printArr(arr, 0);
    }
}

class recursive{

    public void printArr(int[] arr, int i ){
        if(arr.length > i){
        System.out.print(arr[i] + " "); 
        printArr(arr, i+1);
        }
    }
}
