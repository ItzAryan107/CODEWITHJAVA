package OOPS;

public class T085_FinallySimpleTryBlock {
    public static int great(){//we can use multiple try-catch-finally block
        //even we can use try(try catch finally with one return )catch finally, acn be use as nested
        try {
            int a=5;
            int b=0;

            try {
                int c=9;
                int d=3;
                return a/d;
            }catch (Exception e){
                System.out.println(e);
            }
            finally{
                System.out.println("This is second Finally");
            }
            return 2;
        }catch (Exception e){
            System.out.println(e);
        }
        finally {// ye har hal m execute hoga

            //return upar kar chuka hoon, but still ye ye finally block ko execute kr raha hai
            System.out.println("This is the End of this function");
        }

        return 1;//ye return lg rah, in case ye try ke andar nhi jata h to
    }
    //is program m finally block koi sense make nhi kr rha, we will make method to have sense
    public static void main(String[] args) {
        /**
         * This block I am taking in the above method
         try {
         int a=5;
         int b=0;
         int c=a/b;
         }catch (Exception e){
         System.out.println(e);
         }
         finally {// ye har hal m execute hoga
         System.out.println("This is the End of the Program");
         }
         */
        System.out.println(great());
    }
}
