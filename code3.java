public class code3 {
    public static void main(String[] args) {
        one obj = new one();
        obj.setName("SoftDrink");
        System.out.println(obj.getName());
        System.out.println(obj.getPrice());
         
    }
}
 class one {

    private String coke;
    private int cokePrice;

    public one(){
        coke = "drinkType";
        cokePrice = 0;
    }
    public void setName(String name){
        this.coke = name;
    }
    public String getName(){
        return coke;
    }

    public void setPrice(int price){
        this.cokePrice = price;
    }
    public int getPrice(){
        return cokePrice;
    }
 } //encapsulation


