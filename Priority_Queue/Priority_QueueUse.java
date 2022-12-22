package Priority_Queue;

import java.util.PriorityQueue;

public class Priority_QueueUse {
    public static void main(String[] args) {
        Priority_Queue_Min p = new Priority_Queue_Min(); // User Define Priority Queue
        Priority_Queue_Max p1 = new Priority_Queue_Max(); // User Define Priority Queue
        PriorityQueue<Integer> p2 = new PriorityQueue<Integer>(); // Inbuilt Priority Queue

        // Min-Heap
        p.insert(100);
        p.insert(10);
        p.insert(15);
        p.insert(4);
        p.insert(17);
        p.insert(21);
        p.insert(67);
        System.out.println("Min-Heap Size: " + p.getSize());
        System.out.println("Min-heap MinValue: " + p.getMin());
        System.out.print("Min-Heap Elements: ");
        while(!p.isEmpty()){
            System.out.print(p.removeMin() + " ");
        }
        System.out.println();

        // Max-Heap
        p1.insert(15);
        p1.insert(2);
        p1.insert(20);
        p1.insert(9);
        p1.insert(0);
        p1.insert(100);
        System.out.println("Max-Heap Size: " + p1.getSize());
        System.out.println("Max-heap MaxValue: " + p1.getMax());
        System.out.print("Max-Heap Elements: ");
        while(!p1.isEmpty()){
            System.out.print(p1.removeMax() + " ");
        }
        System.out.println();

        // Inbuilt Priority Queue (Min-Heap)
        p2.add(15);
        p2.add(2);
        p2.add(20);
        p2.add(9);
        p2.add(0);
        p2.add(100);
        System.out.println("Size: " + p2.size());
        System.out.println("Heap Min-Value: " + p2.peek());
        System.out.print("Min-Heap Elements: ");
        for(int j : p2){
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

