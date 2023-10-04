public class jjk6 {
    public static void main(String[] args) {
        A studentA = new A(20, 30, 70);
        B studentB = new B(100, 70, 80, 85);
        System.out.println(studentA.getPercentage());
        System.out.println(studentB.getPercentage());        
    }
}

abstract class Marks{

    abstract double getPercentage();

}
class A extends Marks{
    int math , sci , isl;

    A(int a , int b , int c){
        this.isl = a;
        this.math = b;
        this.sci = c;
    }

    @Override
    double getPercentage(){
      double percentage = ((math + isl + sci)/300)*100;
      return percentage;
    }
}
class B extends Marks{
    int math , sci , isl , bio;

    B(int a , int b , int c , int d){
        this.isl = a;
        this.math = b;
        this.sci = c;
        this.bio = d;
    }

    @Override
    double getPercentage(){
      double percentage = ((math + isl + sci + bio)/400)*100;
      return percentage;
    }
}
