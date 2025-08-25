import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t**** Write ==> 'k' to choose from list OR '0' to exit ****  " );

        while (true) {
            char test = input.next().toLowerCase().charAt(0);

            if (test == '0') {
                System.out.println("Exiting program... Bye 👋");
                System.exit(0);
            }

            if (test == 'k') {
                System.out.println("\t\t <== Choose the league you want to follow ==>");
                System.out.println("\t1. Premier League");
                System.out.println("\t2. LaLiga");
                System.out.println("\t3. Bundesliga");
                System.out.println("\t4. Egyptian league");
                System.out.println("\t0. Exit");

                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        PermierLeague p1 = new PermierLeague();
                        break;

                    case 2:
                        Laliga l1 = new Laliga();
                        break;

                    case 3:
                        BUNDESLEAGUE b1 = new BUNDESLEAGUE();
                        break;

                    case 4:
                        EgyptianLeague e1= new EgyptianLeague();
                        break;

                    case 0:
                        System.out.println("Exiting program... Bye 👋");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Choose from the list");
                }
                break;
            } else {
                System.out.println("⚠️ You should write 'k' to start choosing OR '0' to exit, try again:");
            }
        }
    }
}
