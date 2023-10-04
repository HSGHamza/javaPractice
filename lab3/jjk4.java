public class jjk4 {
    public static void main(String[] args) {
        int[][] arr = { {10,39,8},{3,35,87},{22,34} };
        //int[] myarr = new int[4];
        for(int i = 0; i <3; i++){
            for(int j = 0; j <3; j++){
                if(arr[i][j] == 8 || arr[i][j] == 3 ||arr[i][j] == 87 ||arr[i][j] == 34 ){
                    //myarr[i] = arr[i][j]; 
                    System.out.println(arr[i][j]);
                }
            }
        }

    }
}
