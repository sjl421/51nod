import java.io.*;

/**
 * @author mayuan
 * @desc
 * @date 2018/01/01
 */
public class Solution1279 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = bufferedReader.readLine().split("\\s+");
        int depthOfWell = Integer.parseInt(temp[0]);
        int numberOfPlates = Integer.parseInt(temp[1]);

        int[] widthOfWell = new int[depthOfWell];
        int[] widthOfPlates = new int[numberOfPlates];

        for (int i = 0; i < depthOfWell; i++) {
            widthOfWell[i] = Integer.parseInt(bufferedReader.readLine());
        }
        for (int i = 0; i < numberOfPlates; i++) {
            widthOfPlates[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int ans = 0;
        int currentDepthOfWell = depthOfWell;
        for (int i = 0; i < numberOfPlates; i++) {
            if (0 >= currentDepthOfWell) {
                break;
            }

            for (int j = 0; j < currentDepthOfWell; ) {
                if (widthOfPlates[i] <= widthOfWell[j]) {
                    if (j == currentDepthOfWell - 1) {
                        currentDepthOfWell = currentDepthOfWell - 1;
                        ans++;
                        break;
                    }

                    j++;
                    continue;
                } else {
                    currentDepthOfWell = j - 1;
                    if (currentDepthOfWell >= 0) {
                        ans++;
                    }
                    break;
                }
            }
        }

        bufferedWriter.write(ans + "\n");
        bufferedWriter.flush();

    }
}
