import java.util.*;
class knapsack{
    static int[][] temp;
    public static void main(String[] args) {
        int[] weight = {2,5,7,4,3};
        int[] cost = {2,6,4,90,9};
        int w = 10;
        int n = 5;

        temp = new int[w+2][n+2];
        for(int[] x : temp){
            Arrays.fill(x, -1);
        }
        System.out.println(knapsacks(weight, cost, w, n));
    }

    public static int knapsacks(int[] weight, int[] cost, int target, int n){
        if(n == 0 || target == 0)
        return 0;

        if(temp[target][n] != -1)
        return temp[target][n];

        if(weight[n-1] <= target){
            temp[target][n] = (int)Math.max(cost[n-1] + knapsacks(weight, cost, target - weight[n-1], n-1), knapsacks(weight, cost, target, n-1));
            return temp[target][n];
        }

        if(weight[n-1] > target){
            temp[target][n] = knapsacks(weight, cost, target, n-1);
            return temp[target][n];
        }
        return 0;
    }

    // public static int knapsacks(int[] weight, int[] cost, int target, int n){
    //     if(target == 0 || n == -1)
    //     return 0;

    //     if(weight[n] <= target)
    //         return ( (int)Math.max(cost[n] + knapsacks(weight, cost, target - weight[n], n-1), knapsacks(weight, cost, target, n-1)));

    //     if(weight[n] > target)
    //     return knapsacks(weight, cost, target, n-1);

    //     return 0;
    // }

}