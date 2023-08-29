import java.util.PriorityQueue;

public class PriorityQueueMethod {
    public static void main(String[] args) {
        PriorityQueue priorityQueue=new PriorityQueue();
        priorityQueue.offer(85);
        priorityQueue.offer(98);
        priorityQueue.offer(785);
        System.out.println("list of priority queue--------------");
        System.out.println(priorityQueue);
        System.out.println("peek method-----(First in First out-----Shows the element  )--------------");
        System.out.println(priorityQueue.peek());
        System.out.println("Poll method----(First in First out-------Removes the element  )--------------");
        System.out.println(priorityQueue.poll());


    }
}
