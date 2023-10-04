public class jjk5 {
    public static void main(String[] args) {
        A a = new B();
        a.printer();
    }
}

class A{
    static void printer(){
        System.out.println("parrent");
    }
}
class B extends A{
    static void printer(){
        System.out.println("Child");
    }
}