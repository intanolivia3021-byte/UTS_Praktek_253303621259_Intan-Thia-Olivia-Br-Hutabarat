public class GuildMain {

    public static void main(String[] args) {

        // Upcasting polymorphism
        Agent[] agents = new Agent[2];

        agents[0] = new Hacker("ZeroCool", 100);
        agents[1] = new Cyborg("NeoTitan", 150);

        System.out.println("=== ULTIMATE SKILL ===");

        // Loop polymorphism
        for (Agent a : agents) {
            a.ultimateSkill();
        }

        System.out.println("\n=== HACK SYSTEM ===");

        for (Agent a : agents) {

            // Komentar penjelas:
            // Mengecek apakah object mengimplement Hackable
            if (a instanceof Hackable) {

                // Downcasting
                Hackable h = (Hackable) a;

                h.bypassFirewall();
            }
        }

        System.out.println("\n=== TRY CATCH EXCEPTION ===");

        try {

            // Menyerang agent sampai HP minus
            agents[0].setHp(-10);

        } catch (DeadAgentException e) {

            // Menangkap custom exception
            System.out.println("Exception Tertangkap: " + e.getMessage());
        }

        System.out.println("\nProgram selesai tanpa crash.");
    }
}