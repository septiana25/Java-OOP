public class PolimorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Ian");
        employee.sayHello("Cici");

        employee = new Manager("Ian");
        employee.sayHello("Rizal");

        employee = new VicePresident("Ian");
        employee.sayHello("Haris");

        sayHello(new Employee("Ian"));
        sayHello(new Manager("Cici"));
        sayHello(new VicePresident("Rizal"));
    }

    static void sayHello(Employee employee){
        if(employee instanceof  VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP" + employee.name);
        }else if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + employee.name);
        }else {
            System.out.println("Hello " + employee.name);
        }
    }
}
