import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng n: ");
        int n = sc.nextInt();
        int [] A = new int[n];
        System.out.println("Nhập các giá trị của mảng:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i += 2) {
            int left = (i - 1 >= 0) ? A[i - 1] : 0;
            int right = (i + 1 < n) ? A[i + 1] : 0;
            int d = right - left;
            A[i]+=d;
        }
        System.out.println("Mảng sau khi thay đổi:");
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}