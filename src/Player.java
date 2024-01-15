public class Player implements Comparable<Player> {
    private String name;
    private int strength;

    public Player(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    @Override
    public int compareTo(Player player) {
        if (strength == player.strength) {
            return 0;
        } else if (strength > player.strength) {
            return + 1;
        } else if (strength < player.strength) {
            return - 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return name + " (" + strength + ")";
    }

}
