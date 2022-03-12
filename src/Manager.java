class Manager extends Employee{
    //super mengakses parentnya
    Manager(String name){
        super(name);
    }
    //method overriding, mendeklarasikan ulang method
    void sayHello(String name){
        System.out.println("Hai " + name + ", My name Manager " + this.name);
    }
}
