public class jjk2 {
    public static void main(String[] args) {
        demo obj = new demo();
        System.out.println(obj.isEven(10));
        
    }
}

class demo{

    boolean isEven(int k){
        for(int i = 0; i<k; i++){
            if(i == k){
                return true;
            }else{
                return false;
            }   
        }
      
    }
}