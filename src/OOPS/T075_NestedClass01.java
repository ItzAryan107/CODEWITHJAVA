package OOPS;

/**
 Nested Class is used to reduce the code line, make it short
 Inner CLass acn Excess all the Private variable and method
 Inner class can be created in outer class or in Interface
 Inner Class is of Two Type ---> static and Non-static
 Non-Static Inner class is of Three Type --->
 1.Member Inner Class ---> A class created within class but out of method
 2.Anonymous Inner Class ---> A class created implementing interface or extending class.The java compiler decides its name.
 3.Local Inner class ---> A class created within method
 */
public class T075_NestedClass01 {
    public static void outerMethod(){
        System.out.println("Outer Method!");
    }
    static class Inner{// if Inner class is Static them only main method can be static,
        // and if inner class is not static them main method in that inner class should not be static
        public static void main(String[] args) {
            System.out.println("This is inner Class!");
            outerMethod();
        }
    }
}