import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int lastStoneWeight(int[] stones) {

        // Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Add all stones
        for (int stone : stones) {
            pq.offer(stone);
        }

        // Smash two largest stones
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            if (first != second) {
                pq.offer(first - second);
            }
        }

        // If heap is empty, return 0
        return pq.isEmpty() ? 0 : pq.peek();
    }
}  


import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int x : stones)
            pq.add(x);

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();

            if (a != b)
                pq.add(a - b);
        }

        return pq.isEmpty() ? 0 : pq.peek();
    }
}
