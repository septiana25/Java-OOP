public class ManagerApp {
    public static void main(String[] args) {
     var manager = new Manager("Ian");
     manager.sayHello("Cici");

     manager = new VicePresident("Ian");
     manager.sayHello("Rizal");
    }
}
