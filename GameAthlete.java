import java.util.*;

class GameAthlete {
    String name;
    int energy;
    int skill;
    int maxEnergy;
    boolean isActive;
    static int totalAthletes = 0;

    GameAthlete(String name, int energy, int skill) {
        this.name = name;
        this.energy = energy;
        this.skill = skill;
        this.maxEnergy = energy;
        this.isActive = true;
        totalAthletes++;
    }

    void compete(GameAthlete opp) {
        if (!this.isActive || !opp.isActive) {
            System.out.println("One of the athletes is inactive. Match cannot happen.");
            return;
        }
        System.out.println(this.name + " attacks " + opp.name + " with skill " + this.skill);
        opp.energy -= this.skill;
        if (opp.energy <= 0) {
            opp.energy = 0;
            opp.isActive = false;
            System.out.println(opp.name + " has been knocked out!");
        }
    }

    void rest(int amt) {
        if (!this.isActive) {
            System.out.println(this.name + " is inactive and can't rest.");
            return;
        }
        this.energy += amt;
        if (this.energy > this.maxEnergy) this.energy = this.maxEnergy;
        System.out.println(this.name + " rested and recovered " + amt + " energy.");
    }

    void train() {
        if (!this.isActive) {
            System.out.println(this.name + " is inactive and can't train.");
            return;
        }
        Random rand = new Random();
        int gain = rand.nextInt(11);
        this.skill += gain;
        System.out.println(this.name + " trained and gained " + gain + " skill points.");
    }

    void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Energy: " + energy + "/" + maxEnergy);
        System.out.println("Skill Power: " + skill);
        System.out.println("Active: " + isActive);
        System.out.println();
    }

    static void showAll(GameAthlete[] players) {
        System.out.println("\n=== ATHLETE STATS ===");
        for (int i = 0; i < players.length; i++) {
            System.out.println("Athlete " + (i + 1));
            players[i].displayStats();
        }
        System.out.println("Total Athletes Created: " + totalAthletes);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameAthlete[] players = new GameAthlete[3];
        System.out.println("2024503003-Fathima Fahmiya S");

        System.out.println("WELCOME TO ATHLETE BATTLE GAME");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter name, energy, skill for athlete " + (i + 1) + ":");
            String name = sc.next();
            int energy = sc.nextInt();
            int skill = sc.nextInt();
            players[i] = new GameAthlete(name, energy, skill);
        }

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Compete (1v1)");
            System.out.println("2. Rest an athlete");
            System.out.println("3. Train an athlete");
            System.out.println("4. View athlete stats");
            System.out.println("5. Quit game");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter attacker number (1-3): ");
                    int a = sc.nextInt() - 1;
                    System.out.print("Enter opponent number (1-3): ");
                    int b = sc.nextInt() - 1;
                    if (a == b || a < 0 || b < 0 || a > 2 || b > 2) {
                        System.out.println("Invalid selection.");
                    } else {
                        players[a].compete(players[b]);
                    }
                    break;
                case 2:
                    System.out.print("Enter athlete number to rest (1-3): ");
                    int r = sc.nextInt() - 1;
                    System.out.print("Enter rest amount: ");
                    int restAmt = sc.nextInt();
                    if (r >= 0 && r < 3)
                        players[r].rest(restAmt);
                    else
                        System.out.println("Invalid athlete.");
                    break;
                case 3:
                    System.out.print("Enter athlete number to train (1-3): ");
                    int t = sc.nextInt() - 1;
                    if (t >= 0 && t < 3)
                        players[t].train();
                    else
                        System.out.println("Invalid athlete.");
                    break;
                case 4:
                    showAll(players);
                    break;
                case 5:
                    System.out.println("Exiting game. Thanks for playing!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
