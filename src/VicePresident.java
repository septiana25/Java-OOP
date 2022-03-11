public class VicePresident extends Manager {
    VicePresident(String name){
        super(name);
    }
    void sayHello(String name){
        System.out.println("Hai " + name + ", My name VP " + this.name);
    }


}
