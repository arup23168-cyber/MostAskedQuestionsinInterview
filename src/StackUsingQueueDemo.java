import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue {

    Queue<Integer> queue = new LinkedList<>();

    public void push(int value) {

        queue.add(value);

        int size = queue.size();

        for (int i = 0; i < size - 1; i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

public class StackUsingQueueDemo {

    public static void main(String[] args) {

        StackUsingQueue stack = new StackUsingQueue();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
    }
}
