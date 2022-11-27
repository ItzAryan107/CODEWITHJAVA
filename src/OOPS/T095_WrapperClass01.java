package OOPS;

public class T095_WrapperClass01 {
    public static void main(String[] args) {
        // converting object type to primitive type ---> autoboxing
        int a=5;
        double b=7.9;
        String c="Aryan";//it's already an object type
        /*
        .valueOf() keyword is used to convert any primitive data type in its particular object type
        .instanceOf() keyword is use to check whether the generated objects are of Integer or Double type or not
         */

        // First way to convert primitive type to Object type
        Integer aObj=a;
        Double bObj=b;

        System.out.println("Created primitive type to Object Type type ---> "+aObj);

        System.out.println();

        System.out.println("Checking Whether primitive type is converted to object or not ---> instanceof");
        if (aObj instanceof Integer){
            System.out.println("An Object of Integer is created");
        }

        System.out.println();

        if (bObj instanceof Double){
            System.out.println("An object of Double is Created");
        }

        System.out.println();

        int d=9;
        //second way to convert primitive type to Object type
        System.out.println("Converting into Wrapper object ---> .valueOf(primitive DataType)");
        Integer aObj1=Integer.valueOf(d);
        System.out.println(aObj1);

        System.out.println();

        if (aObj1 instanceof Integer){
            System.out.println("An primitive converted to object");
        }
    }
}