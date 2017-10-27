import java.util.Scanner;

/**
 * @author alpha
 * @date 2017/10/26
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // 数组中保存的是前n项的和
        long[] arrayNumber = new long[n+1];

        for (int i=1; i<=n; i++){
            arrayNumber[i] = arrayNumber[i-1] + sc.nextLong();
        }

        int q = sc.nextInt();
        while (0 < q--){
            int begin = sc.nextInt();
            int len = sc.nextInt();
            System.out.println(arrayNumber[begin+len-1] - arrayNumber[begin-1]);
        }

    }
}
