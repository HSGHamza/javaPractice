public class jjk4 {
    public static void main(String[] args) {
        printer p1 = new printer();
        p1.print('a',0);
        p1.print(0, 'b');
        
    }
}

class printer{

    int a;
    char c;

    void print(int a , char c){
        System.out.println("Char: " + c + " int: " + a);
    }
    void print(char c , int a){
        System.out.println("Char: " + c + " int: " + a);
    }
}
