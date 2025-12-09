import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int original = num;
            int digits = 0;
            int sum = 0;

            int temp = num;
            while (temp != 0) {
                temp = temp / 10;
                digits++;
            }
            temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                sum = sum + (int)Math.pow(digit, digits);
                temp = temp / 10;
            }
            if (sum == original) {
                System.out.println("It is an Armstrong number.");
            } else {
                System.out.println("It is NOT an Armstrong number.");
            }

            sc.close();
        }

}
