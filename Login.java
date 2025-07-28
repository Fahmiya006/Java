<<<<<<< HEAD
import java.util.Scanner;

public class Login{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int failCount = 0;

        while (true) {
            System.out.println("2024503003-Fathima Fahmiya S");
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.equals("admin") && password.equals("1234")) {
                System.out.println("Admin login successful.");
            } else if (!username.equals("admin") && !password.equals("1234")) {
                failCount++;
                System.out.println("Non-admin login failed. Fail count: " + failCount);
            } else {
                System.out.println("Login failed.");
            }

            System.out.print("Do you want to try again? (yes/no): ");
            String again = scanner.nextLine();
            if (!again.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
    }
}
=======
import java.util.Scanner;

public class Login{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int failCount = 0;

        while (true) {
            System.out.println("2024503003-Fathima Fahmiya S");
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.equals("admin") && password.equals("1234")) {
                System.out.println("Admin login successful.");
            } else if (!username.equals("admin") && !password.equals("1234")) {
                failCount++;
                System.out.println("Non-admin login failed. Fail count: " + failCount);
            } else {
                System.out.println("Login failed.");
            }

            System.out.print("Do you want to try again? (yes/no): ");
            String again = scanner.nextLine();
            if (!again.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
    }
}
>>>>>>> 693ff1e (Initial commit)
