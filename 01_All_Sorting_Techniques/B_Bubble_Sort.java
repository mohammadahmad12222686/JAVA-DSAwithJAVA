/* 
Bubble Sort:


Comparison and Swap:
The algorithm iterates through the array, comparing adjacent elements and swapping them if they are in the wrong order.

Passes:
Each pass guarantees the largest unsorted element "bubbles up" to its correct position.

Optimization:
The algorithm may include an optimization where it stops early if no swaps are made during a pass, indicating that the array is already sorted.

Repeat:
Steps 1-3 are repeated until no more swaps are needed, indicating that the entire array is sorted.


Complexity Cases:

Time Complexity:
Best Case: O(n) - Occurs when the array is already sorted. The algorithm makes a single pass without any swaps.
Worst Case: O(n^2) - Happens when the array is in reverse order. Requires multiple passes with swaps at each step.
Average Case: O(n^2) - On average, the algorithm makes n/2 passes, resulting in quadratic time complexity.

Space Complexity:
O(1): Bubble sort is an in-place sorting algorithm as it only requires a constant amount of additional memory space for the swapping of elements.

Stability:
Stable: Bubble sort maintains the relative order of equal elements.

Adaptability:
Adaptive: The algorithm can be adaptive if it is implemented with the optimization to stop early if no swaps are made during a pass.

Use Cases:
Bubble sort is suitable for small datasets or partially sorted datasets.
It is not recommended for large datasets due to its quadratic time complexity.
*/

import java.util.Arrays;

public class B_Bubble_Sort {
    

    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
       
        int[] arrayToSort = {64, 25, 12, 22, 11};
        
        System.out.println("Original Array: " + Arrays.toString(arrayToSort));
        //Arrays.toString is used to print the array in a readable format
        bubbleSort(arrayToSort,5);
        System.out.println("Sorted Array: " + Arrays.toString(arrayToSort));
    }

}

