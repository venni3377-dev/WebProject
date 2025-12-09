import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter a number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        System.out.print("Factors of this number:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i + " ");
            }
        }

    }
}

