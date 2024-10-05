import java.util.*;
class employee{
    String name;
    int age;
    double phone;
    String address;
    int salary;

    void printsalary(){
        System.out.println("salary : "+salary);
    }
}

class officer extends employee{
    String special;
}

class manager extends employee{
    String dep;
}

public class main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        officer o=new officer();
        manager m=new manager();
        System.out.println("ENTER OFFICER DETAILS");
        System.out.println("ENTER NAME,AGE,PHONE NUMBER,SALARY,ADDRESS AND SPECIALIZATION :");
        o.name=s.next();
        o.age=s.nextInt();
        o.phone=s.nextDouble();
        o.salary=s.nextInt();
        o.address=s.next();
        o.special=s.next();

        System.out.println("ENTER MANAGER DETAILS");
        System.out.println("ENTER NAME,AGE,PHONE NUMBER,SALARY,ADDRESS AND DEPARTMENT :");
        m.name=s.next();  
        m.age=s.nextInt();
        m.phone=s.nextDouble();
        m.salary=s.nextInt();
        m.address=s.next();
        m.dep=s.next();

        System.out.println("OFFICER DETAILS :");
        System.out.println("NAME : "+o.name);
        System.out.println("AGE : "+o.age);
        System.out.println("PHONE NUMBER : "+o.phone);
        System.out.println("ADDRESS : "+o.address);
        o.printsalary();
        System.out.println("SPECIALIZATION : "+o.special);

        System.out.println("MANAGER DETAILS :");
        System.out.println("NAME : "+m.name);
        System.out.println("AGE : "+m.age);
        System.out.println("PHONE NUMBER : "+m.phone);
        System.out.println("ADDRESS : "+m.address);
        m.printsalary();
        System.out.println("DEPARTMENT : "+m.dep);
    }
}
