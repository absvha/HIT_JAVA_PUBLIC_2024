import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập bán kính r: ");
        double r = s.nextDouble();
        if(0<r & r<1000) {
            double c = 2 * 3.14 *r;
            double S = 3.14 * r * r;
            System.out.printf("Chu vi của hình tròn là: %.3f\n", c);
            System.out.printf("dien tich của hình tròn là: %.3f\n",S);
        }
    }
}