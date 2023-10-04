import java.util.Scanner;

public class jjk1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter length and breath: ");
        int length = obj.nextInt();
        int breadth = obj.nextInt();
        Area rec1 = new Area();
        rec1.setDim(length, breadth);
        System.out.println(rec1.getArea());
    }
}

class Area{
    int length , breadth;
    void setDim(int length, int breadth ){
        this.length = length;
        this.breadth = breadth;
    }

    int getArea(){
        int area = length*breadth;
        return area;
    }
}