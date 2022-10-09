package OOPS;

public class T014_StringMethods {
    public static void main(String[] args) {
        System.out.println("String Methods ===>");
        String name = "Aryan";
        System.out.println("name --->"+name);
        System.out.print("Length of String 'name' --->");
        int value = name.length();
        System.out.println(value);
        System.out.println();
        String lstring = name.toLowerCase();
        System.out.println("Every letter of the String 'name' in lower case --->"+lstring);
        System.out.println();
        String ustring = name.toUpperCase();
        System.out.println("Every letter of the String 'name' in upper case --->"+ustring);
        System.out.println();
        /*
        As Strings are immutable, therefore if we run the method
        it's not going to change the original String
         */
        String nonTrimmedString ="    Aryan     ";
        System.out.println("Before trim ---> "+nonTrimmedString);
        System.out.println("After trim ---> "+nonTrimmedString.trim());
        System.out.println();
        System.out.println("Letter's from position 3 to end in String 'name' ---> "+name.substring(2));
        System.out.println();
        System.out.println("Letter's from position 2 to 5 in String name ---> "+name.substring(1,5));// start index is included end index is excluded
        System.out.println();
        System.out.println("Replacing 'a' by 'A' ---> "+name.replace('a','A') );
        System.out.println();
        System.out.println("Is String 'name' start with Ar or not ---> "+name.startsWith("Ar"));
        System.out.println();
        System.out.println("Is String 'name' ends with yan ---> "+name.endsWith("yan"));
        System.out.println();
        System.out.println("Character at position '3' ---> "+name.charAt(2));
        System.out.println();
        System.out.println("Index of character 'a' in String 'name' ---> "+name.indexOf("a")); // index for 'ry' will be 1
        String name1 = "Aryan prajapati";
        System.out.println("Index of character 'a' in String 'name1' after index 4 ---> "+name1.indexOf("a",4));
        System.out.println();
        System.out.println("Last index of 'a' in String 'name1' ---> "+name1.lastIndexOf("a"));
        System.out.println("Last index of 'a' in String 'name1' start from index 0 to index 9 ---> "+name1.lastIndexOf("a",9));
        System.out.println();
        System.out.println("Is 'name' equal to 'Aryan' ---> "+name.equals("Aryan"));
        System.out.println("Is 'name' equal to 'arYaN' while ignoring case ---> "+name.equalsIgnoreCase("arYaN"));
        System.out.println();
        System.out.println("Escape sequence character ===>");
        System.out.println("Aryan \" Prajapati");
        // link for escape sequence character ---> https://www.geeksforgeeks.org/escape-sequences-in-java/
        // link for video --->https://www.youtube.com/watch?v=1SJK4Y4axXs&list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q&index=14
    }
}
