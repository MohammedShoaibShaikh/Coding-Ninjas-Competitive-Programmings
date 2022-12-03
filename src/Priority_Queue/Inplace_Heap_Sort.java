package Priority_Queue;
// In-place means such algorithm which does not take any extra space other than given input which improves Space-Complexity.
// We are improving Space-Complexity of Min-heap from O(n) to O(1).
public class Inplace_Heap_Sort {

    public void Inplace_heap(int[] pq){
        // Build the Heap in Given Input Array.
        // Up-Heapify
        for(int i = 1; i < pq.length; i++){
            int childIndex = i;
            while(childIndex > 0){
                int parentIndex = (childIndex - 1) / 2;
                if(pq[parentIndex] > pq[childIndex]){
                    int temp = pq[childIndex];
                    pq[childIndex] = pq[parentIndex];
                    pq[parentIndex] = temp;
                }
                else break;
                childIndex = parentIndex;
            }
        }

        // Remove Elements

        int size = pq.length;
        while(size > 1){
            int temp = pq[0];
            pq[0] = pq[size-1];
            pq[size-1] = temp;
            size -= 1;

            // Down-Heapify
            int parentIndex = 0;
            int leftChildIndex = (2 * parentIndex) + 1;
            int rightChildIndex = (2 * parentIndex) + 2;
            while(leftChildIndex < size){
                int midIndex = parentIndex;
                if(pq[midIndex] > pq[leftChildIndex]){
                    midIndex = leftChildIndex;
                }
                if((rightChildIndex < size) && (pq[midIndex] > pq[rightChildIndex])){
                    midIndex = rightChildIndex;
                }
                if(midIndex == parentIndex) break;

                int temp1 = pq[midIndex];
                pq[midIndex] = pq[parentIndex];
                pq[parentIndex] = temp1;

                parentIndex = midIndex;
                leftChildIndex = (2 * parentIndex) + 1;
                rightChildIndex = (2 * parentIndex) + 2;
            }
        }
    }
    // In-place, (Min-Heap => Decreasing Order) and (Max-Heap => Increasing Order) of Array.
    // We Implemented Min-Heap so Array Output will be Decreasing Order.
    public static void main(String[] args){
        int[] input = {0, 5, 8, 1, 4};
        Inplace_Heap_Sort Ip = new Inplace_Heap_Sort();
        Ip.Inplace_heap(input);
        for(int i : input){
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
