public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.doIt();
        /**
         * Ketika melakukan method overriding, yg diakses pasti method overriding nya, lakau diconversi ke objeks parentnya
         */
        //object casts, conversi ke object parent
        Parent parent = (Parent) child;
        parent.doIt();
    }
}
