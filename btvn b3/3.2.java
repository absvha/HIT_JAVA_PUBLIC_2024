import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String reverseString="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi:  ");
        String inputString = scanner.nextLine();
        int length = inputString.length();
        for ( int i = length - 1 ; i >= 0 ; i-- )
            reverseString = reverseString + inputString.charAt(i);
        if (inputString.equals(reverseString))
            System.out.println("la chuoi doi xung: " + inputString.toUpperCase());
        else
            System.out.println("k la chuoi dx: " + inputString.toLowerCase());

    }
}