import java.io.*;

/**
 * @author mayuan
 * @desc
 * @date 2017/11/29
 */
public class Solution1092 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in), 1 << 16);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out), 1 << 16);

        int[][] dp = new int[1005][1005];

        String x = bufferedReader.readLine();
        String y = new StringBuffer(x).reverse().toString();

        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < y.length(); j++) {
                int p = 0;
                if (x.charAt(i) == y.charAt(j)) {
                    p = 1;
                }
                dp[i + 1][j + 1] = Math.max(dp[i][j] + p, Math.max(dp[i + 1][j], dp[i][j + 1]));
            }
        }

        bufferedWriter.write(x.length() - dp[x.length()][y.length()] + "\n");
        bufferedWriter.flush();

    }
}