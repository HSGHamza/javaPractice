import java.util.Scanner;

public class jjk3 {
    public static void main(String[] args) {
        Square sr = new Square();
        sr.Sqr(3);
        
    }
}

class Square{

    void Sqr(int a){
        int sum = 0;
        for( int i = 0; i<a; i++ ){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter integer");
            int b = sc.nextInt();
            sum += b*b;
        }
        System.out.println(sum);
    }
}
