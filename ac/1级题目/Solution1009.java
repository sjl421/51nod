import java.io.*;

/**
 * @author alpha
 * @date 2017/10/26
 */
public class Solution1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in), 1 << 16);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out), 1 << 16);

        int n = Integer.parseInt(bufferedReader.readLine());

        /**
         * dp[x]表示从1~(10^x)-1中1的数字的个数
         * 例如i=3，就是1~999中含有1的数字的个数
         */
        double[] dp = new double[15];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < 15; i++) {
            dp[i] = 10 * dp[i - 1] + Math.pow(10, i - 1);
        }

        double ans = 0.0D;
        int bitID = 1, tail = 0;
        while (0 < n) {
            int yushu = n % 10;
            if (1 == yushu) {
                ans += dp[bitID - 1];
                ans += (tail + 1);
            } else if (0 != yushu) {
                ans += (yushu * dp[bitID - 1] + Math.pow(10, bitID - 1));
            }
            tail += yushu * Math.pow(10, bitID - 1);
            n /= 10;
            bitID++;
        }

        bufferedWriter.write((int) ans + "\n");
        bufferedWriter.flush();
    }
}
