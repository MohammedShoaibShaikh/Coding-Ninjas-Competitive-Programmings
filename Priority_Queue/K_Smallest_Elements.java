package Priority_Queue;

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.ArrayList;

public class K_Smallest_Elements {

    static ArrayList<Integer> Klarge(int[] arr, int k){
        // Min-Heap
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i = 0; i < k; i++){
            pq.add(arr[i]);
        }
        for(int i = k; i < arr.length; i++){
            if(arr[i] > pq.peek()){
                pq.add(arr[i]);
                pq.poll();
            }
        }
        ArrayList<Integer> output = new ArrayList<Integer>();
        while(!pq.isEmpty()){
            output.add(pq.poll());
        }
        return output;
    }
    static ArrayList<Integer> Ksmall(int[] arr, int k){
        // Max-Heap
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i = 0; i < k; i++){
            pq.add(arr[i]);
        }
        for(int i = k; i < arr.length; i++){
            if(arr[i] < pq.peek()){
                pq.add(arr[i]);
                pq.poll();
            }
        }

        ArrayList<Integer> output = new ArrayList<Integer>();
        while(!pq.isEmpty()){
            output.add(pq.poll());
        }
        return output;
    }

    /* Sample Input
        13
        2 12 9 16 10 5 3 20 25 11 1 8 6
        4
        Sample Output
        1 2 3 5
        12 16 20 25
     */

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Size: ");
        int N = sc.nextInt();
        System.out.print("Enter Array of Size N: ");
        int[] input = new int[N];
        for(int i = 0; i < N; i++){
            input[i] = sc.nextInt();
        }
        System.out.print("Enter Value of K: ");
        int k = sc.nextInt();

        // K-Smallest Values
        ArrayList<Integer> output = Ksmall(input, k);
        Collections.sort(output);
        System.out.print("Output of K-Smallest Elements: ");
        for(int i : output){
            System.out.print(i + " ");
        }
        System.out.println();

        // K-largest Values
        ArrayList<Integer> output1 = Klarge(input, k);
        System.out.print("Output of K-largest Elements: ");
        for(int i : output1){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

