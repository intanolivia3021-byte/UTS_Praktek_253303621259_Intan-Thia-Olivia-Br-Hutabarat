public class Cyborg extends Agent {

    // Constructor
    public Cyborg(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void ultimateSkill() {
        System.out.println(getClass().getSimpleName() + " : Menembakkan Laser Plasma!");
    }
}