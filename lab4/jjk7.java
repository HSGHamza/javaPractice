public class jjk7 {
    public static void main(String[] args) {
        revStr("hamza");
    }
    
    public static void revStr(String str){
        if((str.length() <= 1) || (str == null)){
            System.out.print(str);
            return ;
        }
        System.out.print(str.charAt(str.length()-1));
        revStr(str.substring(0, str.length()-1));
    }
}
