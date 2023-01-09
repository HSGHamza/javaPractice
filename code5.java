public class code5 {
    public static void main(String[] args) {
        childKachild obj = new childKachild(15, 16, 17);

    }
}

class parrent {
    int x;

    parrent(){
        System.out.println("parrent class");
    }
    parrent(int x){
        System.out.println("i m const "+ x);
    }
}
class child extends parrent{
    int y;


    child(int x , int y){
        super(9);
        System.out.println("child class");
    }
}
class childKachild extends child{
    int z;

    childKachild(int x , int y , int z){
        super(0 , 9);
        System.out.print("Third const");
    }
}