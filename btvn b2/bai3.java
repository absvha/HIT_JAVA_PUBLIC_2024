import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int c = 1;
        int t = 0, b = n - 1, l = 0, r = n - 1;
        while (c <= n * n) {
            for (int i = l; i <= r; i++) {
                a[t][i] = c++;
            }
            t++;
            for (int i = t; i <= b; i++) {
                a[i][r] = c++;
            }
            r--;
            for (int i = r; i >= l; i--) {
               a[b][i] = c++;
            }
            b--;
            for (int i = b; i >= t; i--) {
                a[i][l] = c++;
            }
            l++;
        }
        System.out.println("A = ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
    }
}