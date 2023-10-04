public class jjk4 {
    public static void main(String[] args) {
        count(10, 0);
        
    }
    public static void count(int s , int count){
        if(s < 1){
            System.out.println(count);
        }else {
            count( s/10 , count+=1);
        }
    }
}
