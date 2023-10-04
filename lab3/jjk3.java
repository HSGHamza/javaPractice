import java.util.Scanner;

public class jjk3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] integer = new int[5];
        for(int i =0; i <5; i++){
            System.out.print("Enter integer: ");
            int name = sc.nextInt();
            integer[i] = name;
        }
        int s = 0;
        boolean acc = false;
        for(int i = 0; i <4; i++){
            if(integer[i] < integer[i+1]){
                s += 1;
            }
        }

        if(s==4){
            acc = true;
        }

        System.out.println(acc);



















    }
}
