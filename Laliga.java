public class Laliga {

    public Laliga()
    {
        System.out.println("\n");
        System.out.println("\t\t*** Choose your team ***");
        System.out.println("1. Real Madrid");
        System.out.println("2. Barcelona");
        System.out.println("3. Atlético Madrid");
        System.out.println("0. Exit");

        int x=Main.input.nextInt();
        System.out.println("\n");
        switch (x)
        {
            case 1:
                Team t1=new Team();
                t1.setGoalkeeper("Thibaut Courtois");
                t1.setDef("Antonio Rüdiger (Center Back)","Dean Huijsen (Center Back)","Éder Militão (Center Back)","Trent Alexander-Arnold (Right Back)");
                t1.setCenter("Arda Güler (Attacking Midfielder)","Federico Valverde (Central Midfielder / Vice-Captain)","Jude Bellingham (Central Midfielder)");
                t1.setAttack("Rodrygo (Right Winger)","Vinícius Júnior (Left Winger)","Kylian Mbappé (Striker)");
                t1.print_players();
                System.out.println("\n");
                System.out.println("<< The high lights >>");
                premierPlayers r1=new premierPlayers();
                r1.setPlayer("K.Mpape", 4, "95 min");
                System.out.println(r1.getPlayer());
                System.out.println("The match ended (7-0) for Real Madrid");
                break;

            case 2 :
                Team t2=new Team();
                t2.setGoalkeeper("Joan García");
                t2.setDef("Alejandro Balde (Left Back)","Pau Cubarsí (Center Back)","Ronald Araújo (Center Back)","Jules Koundé (Right Back)");
                t2.setCenter("Dani Olmo (Attacking Midfielder)","Pedri González (Central Midfielder)","Frenkie de Jong (Central Midfielder)");
                t2.setAttack("Robert Lewandowski (Striker)","Raphinha (Left Winger)","Lamine Yamal (Right Winger)");
                t2.print_players();
                System.out.println("\n");

                System.out.println("<< The high lights >>");
                premierPlayers r2=new premierPlayers();
                r2.setPlayer("Lamine Yamal", 2, "55 min");
                System.out.println(r2.getPlayer());
                System.out.println("The match ended (3-4) for Inter Milan");
                break;



            case 3 :
                Team t3=new Team();
                t3.setGoalkeeper("Jan Oblak");
                t3.setDef("Matteo Ruggeri (Left Back)","Clément Lenglet (Center Back)","Robin Le Normand (Center Back)","José María Giménez (Center Back)");
                t3.setCenter("Álex Baena (Central Midfielder)","Marcos Llorente (Central Midfielder/Wide Mid)","Conor Gallagher (Central Midfielder)");
                t3.setAttack("Griezmann (Right wing)","Alexander Sørloth (Striker)","Julián Álvarez (Striker / Forward)");
                t3.print_players();
                System.out.println("\n");
                System.out.println("<< The high lights >>");
                premierPlayers r3=new premierPlayers();
                r3.setPlayer("Griezmann", 1, "70 min");
                System.out.println(r3.getPlayer());
                System.out.println("The match ended (3-2) for Sevilla");
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
