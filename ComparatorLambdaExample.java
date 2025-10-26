import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ComparatorLambdaExample {
    public static void main(String[] args) {

        System.out.println("Priority Comparator: ");
        Queue<Ticket> pq = new PriorityQueue<>( Comparator.comparingInt(t-> t.priority));
        pq.offer(new Ticket("Alisha", 2));
        pq.offer(new Ticket("Sam", 1));
        pq.offer(new Ticket("Ali", 5));
        pq.offer(new Ticket("shruti", 3));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        System.out.println("Name COmparator:  ");
        Queue<Ticket> pqname = new PriorityQueue<>( Comparator.comparing(t->t.name));
        pqname.offer(new Ticket("Alisha", 2));
        pqname.offer(new Ticket("Sam", 1));
        pqname.offer(new Ticket("Ali", 5));
        pqname.offer(new Ticket("shruti", 3));

        while (!pqname.isEmpty()) {
            System.out.println(pqname.poll());
        }

    }
}
