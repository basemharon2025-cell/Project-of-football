public class PermierLeague {

    public PermierLeague() {
        System.out.println("\n");
        System.out.println("\t\t*** Choose your team ***");
        System.out.println("1. Liverpool");
        System.out.println("2. Man City");
        System.out.println("3. Chelsea");
        System.out.println("0. Exit");

        int x = Main.input.nextInt();
        System.out.println("\n");

        switch (x) {
            case 1:

                Team t1=new Team();
                t1.setGoalkeeper("Alisson Becker");
                t1.setDef("Conor Bradley (Right Back)","Andy Robertson (Left Back)","Ibrahima Konaté (Center Back)","Virgil van Dijk (Center Back)");
                t1.setCenter("Dominik Szoboszlai (Attacking Midfielder)","Alexis Mac Allister (Central Midfielder)","Ryan Gravenberch (Defensive Midfielder)");
                t1.setAttack("Mohamed Salah (Right Winger)","Cody Gakpo (Striker / Forward)","Florian Wirtz (Left Winger / Attacking Midfielder)");
                t1.print_players();
                System.out.println("\n");

                System.out.println("<< The high lights >>");
                premierPlayers r1 = new premierPlayers();
                r1.setPlayer("Salah", 3, "75 min");
                System.out.println(r1.getPlayer());
                System.out.println("The match ended (4-3) for Liverpool");
                break;

            case 2:
                Team t2=new Team();
                t2.setGoalkeeper("James Trafford");
                t2.setDef("Stones (Right Back)","Rayan Aït-Nouri (Left Back)","Joško Gvardiol (Center Back / Left Back)","Rúben Dias (Center Back)");
                t2.setCenter("Tijjani Reijnders (Central Midfielder)","Rodri (Defensive Midfielder)","John Stones (Right Back / Center Back)");
                t2.setAttack("Jérémy Doku (Right Winger)","Omar Marmoush (Left Winger / Striker)","Erling Haaland (Striker)");
                t2.print_players();
                System.out.println("\n");

                System.out.println("<< The high lights >>");
                premierPlayers r2 = new premierPlayers();
                r2.setPlayer("Marmoush", 1, "85 min");
                System.out.println(r2.getPlayer());
                System.out.println("The match ended (2-0) for Man City");
                break;

            case 3:
                Team t3=new Team();
                t3.setGoalkeeper("Đorđe Petrović");
                t3.setDef("Marc Cucurella (Left Back)","Levi Colwill (Center Back)","Axel Disasi (Center Back)","Malo Gusto (Right Back)");
                t3.setCenter("Cole Palmer (Attacking Midfielder / Right Wing)","Enzo Fernández (Defensive Midfielder)","Moisés Caicedo (Defensive Midfielder)");
                t3.setAttack("Nicolas Jackson (Striker)","Conor Gallagher (Attacking Midfielder / Support Striker)","Raheem Sterling (Left Wing)");
                t3.print_players();
                System.out.println("\n");

                System.out.println("<< The high lights >>");
                premierPlayers r3 = new premierPlayers();
                r3.setPlayer("Palmer", 2, "60 min");
                System.out.println(r3.getPlayer());
                System.out.println("The match ended (3-2) for Chelsea");
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
