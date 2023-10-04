public class jjk1 {
    public static void main(String[] args) {
        MyMath obj = new MyMath();
        System.out.println( obj.multiple(6, 3));
        
    }
}

class MyMath {

    boolean multiple(int n ,int m){

        if(n%m == 0){
            return true;
        }else{
            return false;
        }


    }
}

