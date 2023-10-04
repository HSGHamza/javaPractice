import java.util.Scanner;

public class jjk2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] integer = new int[5];
        for(int i =0; i <5; i++){
            System.out.print("Enter integer: ");
            int name = sc.nextInt();
            integer[i] = name;
        }


        int max = 0;
        for(int i = 0; i< 5; i++){
            if(integer[i] > max){
                max = integer[i];
            }
        }
        System.out.println(max);


        int min = max;

        for(int i = 0; i< 5; i++){
            if(integer[i] < min){
                min = integer[i];
            }
        }
        System.out.println(min);










    }
}


