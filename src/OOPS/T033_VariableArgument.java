package OOPS;

public class T033_VariableArgument {
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){

        return a+b+c;
    }
    //    static int sum(int ...vrr){(try)
////        Available as int []arr;
//        int result = 0;
//        for (int j : vrr) {
//            result = result + j;
//        }
//        return result;
//    }
    static int sum(int a,int ...arr){
        int result=a;
        for(int b:arr){
            result=result+b;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to VariableArgument Java Class");
        // down one use to sum up two numbers
        System.out.println("The sum of 4 and 5 ---> "+sum(4,5));
        //down one use to sum up three numbers
        System.out.println("The sum of 4,5 and 6 ---> "+sum(4,5,6));
        // down one use to sum up n numbers
//        System.out.println(sum(1,2,3,4,6,7,4,5,7,4,4,6,6)); (try)
//        System.out.println("Sum of nothing ---> "+sum());// returns zero (try)
        int[] ar={1,2,3,4,5,6,7,8,9};
        System.out.println("Let if one argument is necessary ---> "+sum(1,ar));
        // (try) ---> means uncomment those and try the code
    }
}
