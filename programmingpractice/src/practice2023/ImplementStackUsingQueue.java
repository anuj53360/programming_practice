package programmingpractice.src.practice2023;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
        Queue<Integer> queue;

    public ImplementStackUsingQueue() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
           queue.add(x);
           for (int i=1;i< queue.size();i++){
               queue.offer(queue.remove());
           }
    }

    public int pop() {
              return queue.poll();
    }

    public int top() {
     return   queue.peek();
    }

    public boolean empty() {
   return  queue.isEmpty();
    }
}
