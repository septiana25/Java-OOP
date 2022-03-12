class Parent {
    String name;
    void doIt(){
        System.out.println("Do it in parent");
    }
}
//variabel hidding, membeuat var sama dgn parent
class Child extends Parent{
    String name;
    void doIt(){
        System.out.println("Do it in Child");
    }
}
