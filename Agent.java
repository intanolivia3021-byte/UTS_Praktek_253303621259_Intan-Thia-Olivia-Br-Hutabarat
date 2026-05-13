public abstract class Agent {

    protected String name;
    private int hp;

    // Constructor
    public Agent(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    // Getter HP
    public int getHp() {
        return hp;
    }

    // Setter HP dengan validasi
    public void setHp(int hp) throws DeadAgentException {

        // Komentar penjelas:
        // Throw exception jika HP <= 0
        if (hp <= 0) {
            throw new DeadAgentException(name + " telah kalah karena HP habis!");
        }

        this.hp = hp;
    }

    // Method abstract
    public abstract void ultimateSkill();
}