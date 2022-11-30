package LeetCode;

public class L70_ClimbingStairs {
    public int climbStairs(int n) {
        // the commented code is recursion way, but it extends the time alot to calculate
        // if(n == 1){
        //     return 1;
        // }
        // if(n == 2){
        //     return 2;
        // }

        // return climbStairs(n-1) + climbStairs(n - 2);

        int[] array = new int[n];
        array[0] = 1;
        if(n > 1){
            array[1] = 2;
        }

        for(int i = 2; i<n;i++){
            array[i] = array[i-1] + array[i-2];
        }

        return array[n-1];
    }
}
