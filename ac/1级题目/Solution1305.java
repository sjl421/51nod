import java.io.*;
import java.util.Arrays;
import java.util.Stack;

/**
 * @author mayuan
 * @desc
 * @date 2017/11/29
 */
public class Solution1305 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in), 1 << 16);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out), 1 << 16);

        int n = Integer.parseInt(bufferedReader.readLine());
        long sum = 0L;

        int temp = 0, j = 0;
        for (int i = 0; i < n; i++) {
            temp = Integer.parseInt(bufferedReader.readLine());
            if (2 == temp) {
                j++;
            } else if (1 == temp) {
                sum += (n - 1);
            }
        }
        bufferedWriter.write(sum + j * (j - 1) / 2 + "\n");
        bufferedWriter.flush();
    }
}