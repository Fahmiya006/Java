import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        int sec_no = 45;
        int trial = 0;
        int game_no = 0;
        int guess_no;
        char ch = 'y';
        while (ch == 'y') {
            Scanner sc = new Scanner(System.in);
            System.out.println("2024503003-Fathima Fahmiya S");
            System.out.println("Welcome to the game!!\n Explore this exciting game\n Guess a number between 1 to 100, if your guess and our secret number matches, you win the game!!!\n let's playyyy");
            System.out.println("main menu");
            System.out.println("1.play game");
            System.out.println("2.view status");
            System.out.println("3.Quit");
            System.out.println("enter your choice:");
            int choice = sc.nextInt();
            if (choice == 1) {
                while (trial < 10) {
                    System.out.println("enter your guess number:");
                    guess_no = sc.nextInt();
                    if (guess_no > 100 || guess_no < 1) {
                        if (guess_no == -1) {
                            System.out.println("exiting...");
                            break;
                        } else {
                            System.out.println("enter valid number(1-100)");
                            continue;
                        }
                    } else {
                        if (guess_no == sec_no) {
                            System.out.println("Congrats! Your guess is correct");
                        } else if (guess_no > sec_no) {
                            System.out.println("Your guess is higher than the secret no");
                        } else if (guess_no < sec_no) {
                            System.out.println("your guess is lower than the secret no");
                        }
                    }
                    trial++;
                }
                game_no++;
                System.out.println("Do you want to continue?");
                ch = sc.next().charAt(0);
            } else if (choice == 2) {
                if(game_no==0){
                    System.out.println("no games played");
                }
                else{
                    System.out.println("no. of games=" + game_no);
                    System.out.println("no. of trials=" + trial);
                    double avg = trial / game_no;
                    System.out.println("Average guesses per game:" + avg);
                }
            } else if (choice == 3) {
                System.out.println("quiting");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
