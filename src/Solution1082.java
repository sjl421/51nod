import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author mayuan
 * @desc
 * @date 2017/11/29
 */
public class Solution1082 {

    public static int MAX = 1000001;
    public static double[] num = new double[MAX];

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in), 1 << 16);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out), 1 << 16);

        init();
        int testNumber = Integer.parseInt(bufferedReader.readLine());
        while (0 < testNumber--) {
            int n = Integer.parseInt(bufferedReader.readLine());
            bufferedWriter.write(BigDecimal.valueOf(num[n]).toPlainString().split("\\.")[0] + "\n");
            bufferedWriter.flush();
        }
    }

    public static void init() {
        num[0] = 0;
        for (int i=1; i<MAX; i++){
            if (0 == i%7){

            } else {
                boolean flag = false;
                int temp = i;
                while (0 < temp){
                    if (7 == temp%10){
                        flag = true;
                    }
                    temp /= 10;
                }
                if (flag){
                    num[i] = num[i-1];
                } else {
                    num[i] = num[i-1] + i*i;
                }
            }
        }
    }
}
