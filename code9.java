public class code9 {
    public static void main(String[] args) {
        two object = new two();
        object.greet();
    }
}

abstract class one {
    int One;

    one(){

    }

    abstract public void greet();
}
class two extends one{
    int Two;

    two(){

    }
    @Override
    public void greet(){
        System.out.println("Konichiwa");
    }
}