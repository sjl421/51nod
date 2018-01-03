import java.io.*;

/**
 * @author mayuan
 * @desc
 * @date 2018/01/02
 */
public class Solution1138 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());
        n *= 2;
        boolean hasResult = false;

        for (int i = (int) Math.sqrt(n); i >= 2; i--) {
            if (n % i == 0 && (n / i - (i - 1)) % 2 == 0) {
                bufferedWriter.write((n / i - (i - 1)) / 2 + "\n");
                bufferedWriter.flush();

                hasResult = true;
            }
        }

        if (!hasResult) {
            bufferedWriter.write("No Solution\n");
            bufferedWriter.flush();
        }

    }
}
