package OOPS;

public class T004_Literals {
    public static void main(String[] args) {
        System.out.println("LITERALS --->");
        byte age = 34; // for age, we can safely use byte as it ranges from -128 to 127, and age can not be more than 115
        System.out.println(age);
        char ch = 'A';
        float f1 = (float)5.6; // or float f1 = 5.6f;
        double d1 = 4.883736;
        // literal is what ---> right hand side value is literal
        long l1 = 56666666666L;
        boolean a = true;
        String s1 = "Aryan";
        System.out.print(s1);
        // use link for java keywords ---> https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html

    }
}
