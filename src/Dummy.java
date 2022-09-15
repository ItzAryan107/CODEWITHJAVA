import java.util.Scanner;

public class Dummy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
            int countSpace = 0;

            if (string.charAt(0) == ' ')
                countSpace = -1;

            for (int i = 0;i<string.length()-1;i++){
                if (string.charAt(i) ==' '&& string.charAt(i+1) != ' ')
                    countSpace = countSpace+1;
            }
        System.out.println(countSpace);
    }
}
