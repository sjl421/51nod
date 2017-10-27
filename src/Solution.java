import java.util.Scanner;

/**
 * @author alpha
 * @date 2017/10/26
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrayNumber = new int[n];

        for (int i=0; i<n; i++){
            arrayNumber[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        while (0 < q--){
            int begin = sc.nextInt();
            int len = sc.nextInt();
            long sum = 0;
            for (int i=begin-1; i<begin+len-1; i++){
                sum += arrayNumber[i];
            }
            System.out.println(sum);
        }

    }
}
