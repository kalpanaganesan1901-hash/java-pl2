import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        long[] result = new long[k];
        long[] dp = new long[k];
        for (int num : nums) {
            int mod = num % k;
            long[] newDp = new long[k];
            newDp[mod] = 1;
            for (int r = 0; r < k; r++) {
                int newRemainder = (r * mod) % k;
                newDp[newRemainder] += dp[r];
            }
            for (int r = 0; r < k; r++) {
                result[r] += newDp[r];
            }
            dp = newDp;
        }
        System.out.println("Output:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}
