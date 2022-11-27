package OOPS;

class C1{
    public int x=5;
    protected int y=45;
    int z=6;
    private int a=78;// can only be used in the same class, and if
    // a is not getting change through the whole particular class then we
    // should use the keyword final with private
    public void meth1(){// using all Access Modifier in the same class
        System.out.println("Public int x ---> "+x);
        System.out.println("Protected int y --> "+y);
        System.out.println("int z ---> "+z);
        System.out.println("private int a ---> "+a);
        a=16;
        System.out.println("After change in private int a ---> "+a);

        /*
        world means different package
        Subclass means the class under the java file which has two class
                     class          package          subclass           world
        public         y               y                y                 y
        protected      y               y                y                 n
        default        y               y                n                 n
        private        y               n                n                 n
         */
    }
}

class C2 {
}

class C3{
}

public class T066_AccessModifiers {
    public static void main(String[] args) {
        C1 c1=new C1();
        c1.meth1();
        System.out.println(c1.x);
        System.out.println(c1.y);
        System.out.println(c1.z);
//        System.out.println(c1.a); ---> Not Allowed, bcz 'a' is Private

    }
}