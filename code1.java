//varArgs damn

public class code1{
   public static void main(String[] args) {

   // one obj = new one();
    //System.out.println(obj.factorial(4));    
                    
    }
}

class one {
    
    int b;

    one() {

    }

    public void sum (int ...args){
        int result = 0;
        for (int a : args) {
           System.out.println(result += a);
        }
    }
    public static int factorial (int n){
        if ( n==0 || n == 1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
}
