import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Player> queue = new PriorityQueue<Player>();
        queue.add(new Player("Agus", 99));
        queue.add(new Player("David", 2));
        queue.add(new Player("David Hijo", 1));
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
