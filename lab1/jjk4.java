public class jjk4 {
    public static void main(String[] args) {
        factorial objf = new factorial();
        objf.fact(6);
    }
}

class factorial {

    void fact(int f){
        int factorial = 1;
        if( f == 0){
            factorial = 1;
        }else{
        for(int i=0; i<f; i++){
            factorial += factorial*i;
        }
        }
        System.out.println(factorial);
    }
}
