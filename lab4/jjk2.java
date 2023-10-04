public class jjk2 {
    public static void main(String[] args) {    
     sum(5,0);
    }

    public static void sum(int n , int sum){
        if(n < 1){
            System.out.println(sum);
        }  else {
            sum += n;
            sum( n-1 , sum);
        }
        
}
}


