
public class jjk5 {
    public static void main(String[] args) {
        
        System.out.println(count(854));
    }
    public static int count(int s){
        int c = 0;
        if(s != 0){
             c = s%10 + count(s/10);
        }
        return c;
}
}