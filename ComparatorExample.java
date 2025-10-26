import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Ticket {
    String name;
    int priority;

    Ticket(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ticket :[ name : " + this.name + ", priority: " + this.priority + "]";
    }
}

class NameComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket o1, Ticket o2) {
        // TODO Auto-generated method stub
        return o1.name.compareTo(o2.name);
    }

}

class PriorityComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket o1, Ticket o2) {
        // TODO Auto-generated method stub
        return o1.priority - o2.priority;
    }

}

public class ComparatorExample {
    public static void main(String[] args) {

        System.out.println("Priority Comparator: ");
        Queue<Ticket> pq = new PriorityQueue<>(new PriorityComparator());
        pq.offer(new Ticket("Alisha", 2));
        pq.offer(new Ticket("Sam", 1));
        pq.offer(new Ticket("Ali", 5));
        pq.offer(new Ticket("shruti", 3));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        System.out.println("Name COmparator:  ");
        Queue<Ticket> pqname = new PriorityQueue<>(new NameComparator());
        pqname.offer(new Ticket("Alisha", 2));
        pqname.offer(new Ticket("Sam", 1));
        pqname.offer(new Ticket("Ali", 5));
        pqname.offer(new Ticket("shruti", 3));

        while (!pqname.isEmpty()) {
            System.out.println(pqname.poll());
        }

    }
}
