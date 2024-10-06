import java.util.*;
class employee{
    String name;
    int id;
    int salary;
    void display(){
        System.out.println("EMPLOYEE DETAILS:)");
    }
    void calcSalary(){
        System.out.println("SALARY OF EMPLOYEE : "+salary);
    }
}

class engineer extends employee{
    void calcSalary(){
        System.out.println("SALARY OF ENGINEER :"+salary);
    }
}

public class main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        engineer e = new engineer();
        System.out.println("ENTER EMPLOYEE NAME,ID,SALARY : ");
        e.name = s.next();
        e.id = s.nextInt();
        e.salary = s.nextInt();
        
        e.display();
        System.out.println("NAME : "+e.name);
        System.out.println("ID : "+e.id);
        e.calcSalary();
        
    }
}
