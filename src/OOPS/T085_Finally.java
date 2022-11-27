package OOPS;

public class T085_Finally {
    public static void main(String[] args) {
        int a=8876;
        int b= 10;
        while (true){
            try {
                System.out.println(a/b);
            }catch (Exception e){
                System.out.println("Exception !!");
                break;
            }finally {// break hone ke baad bhi finally execute hua
                System.out.println("I am Finally! - "+b);
            }
            b--;
        }
        // we can also write finally with try, means try without catch
        try{
            System.out.println("Aryan Prajapati");
        }finally {
            System.out.println("This is finally");
        }// this time finally and try dono chalega, but agar try nhi chala kisi samay to finally to chalega hi chalega
    }
}
