import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a, b;
        a = sc.nextInt();
        b = a*a;
        System.out.println(b);
    }
}