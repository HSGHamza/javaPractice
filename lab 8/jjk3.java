import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class jjk3 {
    public static void reverseFirstKElements(Queue<Integer> queue, int k) {
        if (k <= 0 || k > queue.size()) {
            throw new IllegalArgumentException("Invalid value of k");
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        Queue<Integer> tempQueue = new LinkedList<>();
        while (!stack.isEmpty()) {
            tempQueue.offer(stack.pop());
        }

        while (!queue.isEmpty()) {
            tempQueue.offer(queue.poll());
        }

        while (!tempQueue.isEmpty()) {
            queue.offer(tempQueue.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        int k = 3;

        System.out.println("Original Queue: " + queue);
        reverseFirstKElements(queue, k);
        System.out.println("Reversed Queue: " + queue);
    }
}
