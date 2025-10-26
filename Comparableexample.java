import java.util.PriorityQueue;
import java.util.Queue;

class Ticket implements Comparable<Ticket> {

    String name;
    int priority;

    Ticket(String name, int priority) {

        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Ticket other) {

        return this.priority - other.priority;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ticket :[ name : " + this.name + ", priority: " + this.priority + "]";
    }

}

class Comparableexample {
    public static void main(String args[]) {

        Queue<Ticket> pq = new PriorityQueue<>();
        pq.offer(new Ticket("Alisha", 2));
        pq.offer(new Ticket("Sam", 1));
        pq.offer(new Ticket("Ali", 5));
        pq.offer(new Ticket("shruti", 3));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}