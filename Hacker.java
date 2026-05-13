public class Hacker extends Agent implements Hackable {

    // Constructor
    public Hacker(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void ultimateSkill() {
        System.out.println(getClass().getSimpleName() + " : Menyebarkan Virus EMP!");
    }

    @Override
    public void bypassFirewall() {
        System.out.println("Firewall jebol dalam 3 detik.");
    }
}