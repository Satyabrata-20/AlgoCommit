import java.util.PriorityQueue;

class Solution {

    // Function to find kth smallest element
    public int kthSmallest(int[] arr, int k) {

        // Max Heap
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>((a, b) -> b - a);

        for (int num : arr) {

            // Add element
            maxHeap.add(num);

            // Keep only k smallest elements
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // Top element is kth smallest
        return maxHeap.peek();
    }
}