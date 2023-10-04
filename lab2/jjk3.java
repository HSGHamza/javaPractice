public class jjk3 {
    public static void main(String[] args) {
        Employee ubaid = new Employee("18", "ubaid", "north", "911", "0 usd", "useless", "half stalk");
        ubaid.printSalary();
        
    }
}

class Member{

    String age,name,cell,address,salary;

    void printSalary(){
        System.out.println(salary);
    }
}

class Employee extends Member{
    String specialization , department;

    Employee(String age , String name , String address , String cell , String salary , String special , String depart){
        
        super.age = age;
        super.name = name;
        super.address = address;
        super.cell = cell;
        super.salary = salary;
        this.specialization = special;
        this.department = depart;
        
    }

}
class Manager extends Member{
    String specialization , department;
    Manager(String age , String name , String address , String cell , String salary , String special , String depart){
        super.age = age;
        super.name = name;
        super.address = address;
        super.cell = cell;
        super.salary = salary;
        this.specialization = special;
        this.department = depart;
    }
    
}
