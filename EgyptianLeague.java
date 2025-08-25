public class EgyptianLeague {

    public EgyptianLeague() {
        System.out.println("\n");
        System.out.println("\t\t*** Choose your team ***");
        System.out.println("1. Al-Ahly");
        System.out.println("2. Zamalek");
        System.out.println("3. Pyramids");
        System.out.println("0. Exit");

        int x = Main.input.nextInt();
        System.out.println("\n");

        switch (x) {
            case 1:
                Team t1= new Team();
                t1.setAttack("Hussein El Shahat (Right Winger)","Percy Tau (Left Winger)","Mahmoud Kahraba (Striker)");
                t1.setGoalkeeper("Mohamed El Shenawy");
                t1.setDef("Mohamed Hany (Right Back)","Yasser Ibrahim (Center Back)","Ashraf Dari (Center Back)","Ali Maaloul (Left Back)");
                t1.setCenter("Aliou Dieng (Defensive Midfielder)","Hamdi Fathi (Defensive Midfielder)","Emam Ashour (Attacking Midfielder)");
                t1.print_players();
                System.out.println("\n");
                System.out.println("<< The high lights >>");
                premierPlayers r1 = new premierPlayers();
                r1.setPlayer("Zizo", 3, "120 min");
                System.out.println(r1.getPlayer());
                System.out.println("The match ended (4-3) for Al-Ahly");
                break;

            case 2:
                Team t2=new Team();
                t2.setGoalkeeper("Mohamed Awad");
                t2.setDef("Ahmed Hossam (Right Back)","Mahmoud Bentayg (Center Back)","Hossam Abdel Meguid (Center Back)","Ahmed Fatouh (Left Back)");
                t2.setCenter("Nabil Emad Donga (Defensive Midfielder)","Ahmed Hamdy (Central Midfielder)","Abdallah El-Saeed (Central/Attacking Midfielder)");
                t2.setAttack("Nasser Mensi (Striker)","Shikabala (Attacking Midfielder/Right Winger)","Seifeddine Jaziri (Striker)");
                t2.print_players();
                System.out.println("\n");

                System.out.println("<< The high lights >>");
                premierPlayers r2 = new premierPlayers();
                r2.setPlayer("Nasser Mansy", 2, "85 min");
                System.out.println(r2.getPlayer());
                System.out.println("The match ended (2-0) for Zamalek");
                break;

            case 3:
                Team t3=new Team();
                t3.setGoalkeeper("Ahmed El-Shenawy");
                t3.setDef("Mohammed Chibi (Right-Back)","Ahmed Samy (Center-Back)","Mahmoud Marei (Center-Back)","Mohamed Hamdi (Left-Back)");
                t3.setCenter("Ibrahim Blati Touré (Defensive Midfielder)","Walid El Karti (Central Midfielder)","Ramadan Sobhi (Attacking Midfielder)");
                t3.setAttack("Mostafa Fathi (Right Winger)","Marwan Hamdy (Striker)","Fiston Mayele (Center-Forward)");
                t3.print_players();
                System.out.println("\n");

                System.out.println("<< The high lights >>");
                premierPlayers r3 = new premierPlayers();
                r3.setPlayer("Ibrahim Adel", 1, "80 min");
                System.out.println(r3.getPlayer());
                System.out.println("The match ended (2-3) for Petrojet");
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
