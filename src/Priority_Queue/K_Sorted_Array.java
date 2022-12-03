package Priority_Queue;

import java.util.PriorityQueue;

public class K_Sorted_Array {
    static void ksort(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i = 0; i < k; i++){
            pq.add(arr[i]);
        }
        int j = 0;
        for(int i = k; i < arr.length; i++){
            arr[j] = pq.peek();
            pq.poll();
            pq.add(arr[i]);
            j++;
        }

        while(!pq.isEmpty()){
            arr[j] = pq.peek();
            pq.poll();
            j++;
        }
    }
    public static void main(String[] args){
        int[] input = {10, 12, 6, 7, 9};
        int k = 3;
        ksort(input, k);
        for(int i : input){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

