class Person {
    String name ;
    void DisplayPerson (){
        name = "samej & shreyssh";
        System.out.println("Person name is " + name);
    }
}

class Employee extends Person {
    int empID;
    void displayEmpId(){
        empID = 101;
        System.out.println("Employee id is" + empID);
    }
}

class Manager extends Employee{
    String departmant;
    void DisplayManager(){
        departmant = "IF";
        System.out.println("Dipartment is " + departmant);
    }
}

public class MultilevelInhertance {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.DisplayPerson();
        m.displayEmpId();
        m.DisplayManager();
    }
    
}
