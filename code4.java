public class code4 {
    public static void main(String[] args) {
    
        parrent objP = new parrent();
        objP.printMeP();
        child objC = new child();
        objC.printMeP();
    }
}
class parrent{

    int x , y , z;

    parrent(){
        this.x = 16;
        this.y = 17;
        this.z = 18;
    }

    public void printMeP(){
        System.out.println(x + y + z);
    }
}

class child extends parrent{
     int a , b , c;

     child(){

     }

     public void printMe(){
        System.out.println(a + b + c);
     }
}//inheritance