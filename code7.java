public class code7 {
    public static void main(String[] args) {
        One obj = new Two();
        obj.name();
        obj.oop();
        //obj.type(); throws an error 
    }
}

class One{
    public void name(){
        System.out.println("java is my name");
    }
    public void oop(){
        System.out.println("yes, oop language");
    }
}
class Two extends One{
    @Override
    public void name(){
        System.out.println("python is my name");
    }
    public void type(){
        System.out.println("Interperater");
    }
}