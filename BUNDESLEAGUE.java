public class BUNDESLEAGUE {

    public BUNDESLEAGUE() {
        System.out.println("\n");
        System.out.println("\t\t*** Choose your team ***");
        System.out.println("1. FC Bayern München");
        System.out.println("2. Eintracht Frankfurt");
        System.out.println("3. Borussia Dortmund 'BVB'");
        System.out.println("0. Exit");

        int x = Main.input.nextInt();
        System.out.println("\n");

        switch (x) {
            case 1:
                Team t1=new Team();
                t1.setGoalkeeper("Manuel Neuer");
                t1.setDef("Josip Stanisic (Left Back)","Jonathan Tah (Center Back)","Dayot Upamecano (Center Back)","Konrad Laimer (Right Back)");
                t1.setCenter("Michael Olise (Attacking Midfielder / Right Wing)","Leon Goretzka (Central Midfielder)","Joshua Kimmich (Defensive/Central Midfielder)");
                t1.setAttack("Serge Gnabry (Right Winger)","Luis Díaz (Left Winger)","Harry Kane (Striker)");
                t1.print_players();
                System.out.println("\n");

                System.out.println("<< The high lights >>");
                premierPlayers r1 = new premierPlayers();
                r1.setPlayer("Harry Kane", 0, "90 min");
                System.out.println(r1.getPlayer());
                System.out.println("The match ended (0-3) for RB Leipzig");
                break;

            case 2:
                Team t2=new Team();
                t2.setGoalkeeper("Kevin Trapp");
                t2.setDef("Nathaniel Brown (Left Back)","Arthur Theate (Center Back)","Robin Koch (Center Back)","Rasmus Kristensen (Right Back)");
                t2.setCenter("Mario Götze (Attacking Midfielder)","Hugo Larsson (Central Midfielder)","Ellyes Skhiri (Defensive Midfielder)");
                t2.setAttack("Jonathan Burkardt (Striker / Forward)","Hugo Ekitike (Striker)","Can Uzun (Attacking Midfielder / Forward)");
                t2.print_players();
                System.out.println("\n");

                System.out.println("<< The high lights >>");
                premierPlayers r2 = new premierPlayers();
                r2.setPlayer("Karl-Heinz", 1, "85 min");
                System.out.println(r2.getPlayer());
                System.out.println("The match ended (2-0) for Eintracht Frankfurt");
                break;

            case 3:
                Team t3=new Team();
                t3.setGoalkeeper("Gregor Kobel");
                t3.setDef("Yan Couto (Right Back)","Waldemar Anton (Center Back)","Ramy Bensebaini (Left Back)","Nico Schlotterbeck (Center Back)");
                t3.setCenter("Pascal Groß (Central Midfielder)","Julian Brandt (Attacking Midfielder / Winger)","Jobe Bellingham (Central Midfielder)");
                t3.setAttack("Maximilian Beier (Forward)","Karim Adeyemi (Forward / Winger)","Serhou Guirassy (Striker)");
                t3.print_players();
                System.out.println("\n");

                System.out.println("<< The high lights >>");
                premierPlayers r3 = new premierPlayers();
                r3.setPlayer("Marcel Sabitzer", 2, "120 min");
                System.out.println(r3.getPlayer());
                System.out.println("The match ended (6-2) for BVB");
                break;

            case 0:
                System.out.println("Exiting program... Bye 👋");
                System.exit(0);
                break;

            default:
                System.out.println("⚠️ Choose from these teams");
        }
    }
}
