package OOPS;

public class T024_BreakStatement {
    public static void main(String[] args) {
        for(int i = 0;i<5;i++){
            System.out.print(i+" ");
            System.out.println("Jva is great!");
            if(i==2){
                System.out.println("Ending the Loop");
                break;
            }
        }
        System.out.println("Loop ends here");
        System.out.println();
        for(int j = 0;j<5;j=j+1){
            if(j==2)
                continue;
            else {
                System.out.println(j);
            }
        }
    }
}
