import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final String SQUARE = "Square";
        final String TRIANGLE = "Triangle";
        final String CIRCLE ="Circle";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hình dạng của viên gạch (Square, Triangle, Circle):");
        String type = sc.nextLine();
        if(type.equals(SQUARE)){
            System.out.println("nhap do dai canh vuong a: ");
            int a =sc.nextInt();
            double dtSquare = Math.pow(a,2);
            System.out.printf("dien tich hv : %.2f",dtSquare);
        }
        else if (type.equals(TRIANGLE)){
            System.out.println("nhap 3 canh tam giac: ");
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (d+b>c && c+b>d && d+c>b){
               double p = (b + c +d)/2.0;
               double dtTriangle = Math.sqrt(p*(p-b)*(p-c)*(p-d));
               System.out.printf("Dien tich tam giac:  %.2f",dtTriangle);
            }
            else{
                System.out.printf("khong la tam giac");
            }
        }
        else if(type.equals(CIRCLE)){
            System.out.println("nhap ban kinh: ");
            int r = sc.nextInt();
            double dtCircle = Math.PI * Math.pow(r,2);
            System.out.printf("dien tich hinh tron: %.2f",dtCircle);
        }

    }
}