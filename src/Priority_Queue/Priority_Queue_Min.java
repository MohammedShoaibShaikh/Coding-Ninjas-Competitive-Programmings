package Priority_Queue;

import java.util.ArrayList;
// Priority Queue allocate according to i) FCFS ii) Priority Factor
// PQ are of two type i) MIN ii) MAX
// Three main Function 1) insert 2) getMax & getMin(top/peek) 3) removeMax & removeMin(pop/poll)

// Priority Class for Min-Heap
public class Priority_Queue_Min {
    private ArrayList<Integer> pq;
    Priority_Queue_Min(){
        pq = new ArrayList<Integer>();
    }

    public boolean isEmpty(){
        return pq.size() == 0;
    }

    public int getSize(){
        return pq.size();
    }

    public int getMin(){
        if(isEmpty()){
            return 0;
        }
        return pq.get(0);
    }

    public void insert(int element){
        pq.add(element);

        int childIndex = pq.size() - 1;
        while(childIndex > 0){
            int parentIndex = (childIndex - 1) / 2;
            if(pq.get(childIndex) < pq.get(parentIndex)){
                int temp = pq.get(childIndex);
                pq.set(childIndex, pq.get(parentIndex));
                pq.set(parentIndex, temp);
            }
            else break;
            childIndex = parentIndex;
        }
    }

    public int removeMin(){
        if(isEmpty()) return 0;

        int ans = pq.get(0);
        pq.set(0, pq.get(pq.size()-1));
        pq.remove(pq.size() - 1);

        // Down-Heapify
        int parentIndex = 0;
        int leftChildIndex = (2 * parentIndex) + 1;
        int rightChildIndex = (2 * parentIndex) + 2;

        while(leftChildIndex < pq.size()){
            int midIndex = parentIndex;
            if(pq.get(midIndex) > pq.get(leftChildIndex)){
                midIndex = leftChildIndex;
            }
            if((rightChildIndex < pq.size()) && (pq.get(midIndex) > pq.get(rightChildIndex))){
                midIndex = rightChildIndex;
            }
            if(midIndex == parentIndex) break;

            int temp = pq.get(midIndex);
            pq.set(midIndex, pq.get(parentIndex));
            pq.set(parentIndex, temp);

            parentIndex = midIndex;
            leftChildIndex = (2 * parentIndex) + 1;
            rightChildIndex = (2 * parentIndex) + 2;

        }
        return ans;
    }

}

