public class jjk5 {

    public static void main(String[] args)
    {
        String[][] arr = { {"hello","there","world"},
                          {"how","are","you"} };


        int rows = 1;
        for(int i = 0; i < arr.length; i++){
            rows += i;
        }
        System.out.println("rows: " + rows);


        int columns = 1;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                columns += j;

            }
        }
        System.out.println("Columns: " + columns);
 

    }
}
