public class Team {
    private String goalkeeper;
    private String def1;
    private String def2;
    private String def3;
    private String def4;
    private String center1;
    private String center2;
    private String center3;
    private String attack1;
    private String attack2;
    private String attack3;

    public void setGoalkeeper(String keeper) {
        goalkeeper = keeper;
    }
    public void setDef(String a,String b,String c,String d) {
        def1 = a;
        def2 = b;
        def3 = c;
        def4 = d;
    }
    public void setCenter(String a,String b , String c) {
        center1 = a;
        center2 = b;
        center3 = c;
    }
    public void setAttack(String a ,String b , String c) {
        attack1 = a;
        attack2 = b;
        attack3 = c;
    }

    public void print_players() {
        System.out.println("🧤 Goalkeeper : " + goalkeeper);

        System.out.println("\n🛡️ Defenders : ");
        System.out.println("\t" + def1);
        System.out.println("\t" + def2);
        System.out.println("\t" + def3);
        System.out.println("\t" + def4);

        System.out.println("\n⚙️ Midfielders : ");
        System.out.println("\t" + center1);
        System.out.println("\t" + center2);
        System.out.println("\t" + center3);

        System.out.println("\n⚡ Forwards : ");
        System.out.println("\t" + attack1);
        System.out.println("\t" + attack2);
        System.out.println("\t" + attack3);
    }

}
