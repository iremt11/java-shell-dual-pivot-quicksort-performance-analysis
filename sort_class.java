import java.util.Random;

public class Sort {
    
    // ShellSort implementation
    public void shellSort(int[] array) {
        int n = array.length;
        
        // Start with a big gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                
                // Shift earlier gap-sorted elements up until the correct location for array[i] is found
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                
                // Put temp (the original array[i]) in its correct location
                array[j] = temp;
            }
        }
    }
    
    // DualPivotQuickSort implementation
    public void dualPivotQuickSort(int[] array, int low, int high) {
        if (low < high) {
            // Choose two pivots
            if (array[low] > array[high]) {
                swap(array, low, high);
            }
            
            int pivot1 = array[low];
            int pivot2 = array[high];
            
            // Partition the array
            int[] pivots = partition(array, low, high, pivot1, pivot2);
            int lt = pivots[0];
            int gt = pivots[1];
            
            // Recursively sort the three parts
            dualPivotQuickSort(array, low, lt - 1);
            dualPivotQuickSort(array, lt + 1, gt - 1);
            dualPivotQuickSort(array, gt + 1, high);
        }
    }
    
    // Partition method for dual pivot quicksort
    private int[] partition(int[] array, int low, int high, int pivot1, int pivot2) {
        int lt = low + 1;  // Left boundary
        int gt = high - 1; // Right boundary
        int i = low + 1;   // Current index
        
        while (i <= gt) {
            if (array[i] < pivot1) {
                swap(array, i, lt);
                lt++;
                i++;
            } else if (array[i] > pivot2) {
                swap(array, i, gt);
                gt--;
            } else {
                i++;
            }
        }
        
        // Place pivots in their correct positions
        swap(array, low, lt - 1);
        swap(array, high, gt + 1);
        
        return new int[]{lt, gt + 1};
    }
    
    // Helper method to swap elements
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    // Generate array with equal integers
    public int[] equal(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = 5; // All elements are the same
        }
        return array;
    }
    
    // Generate array with decreasing integers
    public int[] decreasing(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i;
        }
        return array;
    }
    
    // Generate array with increasing integers
    public int[] increasing(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        return array;
    }
    
    // Generate array with random integers
    public int[] random(int size) {
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(size * 10); // Random numbers between 0 and size*10
        }
        return array;
    }
}