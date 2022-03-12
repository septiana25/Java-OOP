public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Ian");
        employee.sayHello("Cici");

        employee = new Manager("Ian");
        employee.sayHello("Rizal");

        employee = new VicePresident("Ian");
        employee.sayHello("Haris");

        //method polymorphisme
        sayHello(new Employee("Ian"));
        sayHello(new Manager("Cici"));
        sayHello(new VicePresident("Rizal"));
    }
    //polymorphism kemampuan merubah bentuk ke bentuk lain
    //instanceof u/ mengecek type data objeck
    static void sayHello(Employee employee){
        if(employee instanceof  VicePresident){
            //conversi ke object parentnya
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
