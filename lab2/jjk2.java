import java.util.Scanner;


public class jjk2 {
    public static void main(String[] args) {
        Average inte = new Average();
        System.out.println(inte.calculate()); 
    }
    
    
}

class Average{

    int int1,int2,int3;
    
    Average(){
        Scanner inp = new Scanner(System.in);
        System.out.print("enter integer 1: ");
        this.int1 = inp.nextInt();
        System.out.print("enter integer 2: ");
        this.int2 = inp.nextInt();
        System.out.print("enter integer 3 ");
        this.int3 = inp.nextInt();
    }

    int calculate(){
        int avg = (int1+int2+int3)/3;
        return avg;
    }
}
