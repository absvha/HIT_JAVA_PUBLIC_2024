import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int) (Math.random()*11);
        int b = (int) (Math.random()*11);
        int c = (int) (Math.random()*21);
        System.out.println ("phep toan: " + a + "+" + b + "=" + c);
        boolean correct = (a + b == c);
        System.out.println("phep tinh tren dung hay sai(Y/N): ");
        String type = sc.nextLine();
            if ((type.equals("Y") && correct) || (type.equals("N") && !correct)) {
                System.out.printf("correct");
            } else {
                System.out.printf("not correct");
            }


    }
}