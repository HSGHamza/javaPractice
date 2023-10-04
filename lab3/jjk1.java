import java.util.Scanner;

class jjk1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        for(int i =0; i <5; i++){
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            names[i] = name;
        }
        for(int i = 0; i< 5; i++){
            System.out.print(names[i] + " ");
        }
    }
}