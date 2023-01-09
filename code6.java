import javax.security.auth.kerberos.KerberosCredMessage;

public class code6 {
    public static void main(String[] args) {
    A a = new A();
    B b = new B();

    a.printer();
    b.cod();
        
    }
}

class A {
    protected int x = 1 ;

    A(){
    }
    
    public void printer (){
        System.out.println("HSG");
    }
}

class B extends A {
    int y = 2;

    B(){
    }

    @Override
    public void printer(){
        System.out.println("HSG2");
    }

    public void cod(){
        super.printer();
        System.out.println(super.x);
    }
}