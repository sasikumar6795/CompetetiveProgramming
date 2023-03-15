package mapBased;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LeastNumberOfUniqueIntegers {

    public static void main(String[] args) {
        int arr[] =  {4,3,1,1,3,3,2};
        System.out.println(findLeastNumOfUniqueInts(arr, 3 ));
    }
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> least = new HashMap<>();
        for(int i=0 ; i<arr.length;i++) {

            if(least.containsKey(arr[i])) {
                least.put(arr[i], least.get(arr[i]) + 1 );
            }
            else {
                least.put(arr[i], 1);
            }



           // least.put(arr[i], least.getOrDefault(arr[i],0) + 1);
        }

        PriorityQueue<Integer> priorityQueue =  new PriorityQueue<>(least.values());

        while(k > 0) {
            k = k- priorityQueue.poll();
        }

        return k < 0 ? priorityQueue.size()+1 : priorityQueue.size();

    }
}
