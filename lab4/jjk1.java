class jjk1{
    public static void main(String[] args) {
        recursive a = new recursive();
        a.natural(1);
        
    }
}

class recursive {
    public static void natural(int n){
        if( n <= 50){
            System.out.println(n);
            natural(n+1);
        }
    }
}