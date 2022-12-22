package Priority_Queue;

import java.util.ArrayList;

public class Priority_Queue_Max {
    private ArrayList<Integer> maxheap;

    Priority_Queue_Max(){
        maxheap = new ArrayList<Integer>();
    }
    public boolean isEmpty(){
        return maxheap.size() == 0;
    }

    public int getSize(){
        return maxheap.size();
    }

    public int getMax(){
        if(isEmpty()) return 0;
        return maxheap.get(0);
    }

    public void insert(int element){
        maxheap.add(element);
        int childIndex = maxheap.size() - 1;
        while(childIndex > 0){
            int parentIndex = (childIndex - 1) / 2;
            if(maxheap.get(childIndex) > maxheap.get(parentIndex)){
                int temp = maxheap.get(childIndex);
                maxheap.set(childIndex, maxheap.get(parentIndex));
                maxheap.set(parentIndex, temp);
            }
            else break;
            childIndex = parentIndex;
        }
    }

    public int removeMax(){
        if(isEmpty()) return 0;
        int ans = maxheap.get(0);
        maxheap.set(0, maxheap.get(maxheap.size() - 1));
        maxheap.remove(maxheap.size() - 1);
        // Down-Heapify
        int parentIndex = 0;
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;

        while(leftChildIndex < maxheap.size()){
            int midIndex = parentIndex;
            if(maxheap.get(midIndex) < maxheap.get(leftChildIndex)){
                midIndex = leftChildIndex;
            }
            if((rightChildIndex < maxheap.size()) && (maxheap.get(midIndex) < maxheap.get(rightChildIndex))){
                midIndex = rightChildIndex;
            }
            if(midIndex == parentIndex) break;

            int temp = maxheap.get(midIndex);
            maxheap.set(midIndex, maxheap.get(parentIndex));
            maxheap.set(parentIndex, temp);

            parentIndex = midIndex;
            leftChildIndex = 2 * parentIndex + 1;
            rightChildIndex = 2 * parentIndex + 2;
        }
        return ans;
    }

}

