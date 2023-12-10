/*

Selection Sort:


Initialization:
The algorithm begins by dividing the input into a sorted and an unsorted region.
Initially, the sorted region is empty, and the unsorted region contains all elements.

Selection Process:
Find the smallest (or largest, depending on the sorting order) element in the unsorted region.
Swap this element with the first element in the unsorted region.

Expansion of Sorted Region:
The sorted region is expanded to include the newly swapped element.
The unsorted region is reduced by one element.

Repeat:
Repeat steps 2-3 until the entire array is sorted.

Completion:
The algorithm terminates when the entire array is sorted.

Complexity Cases:

Time Complexity:
Best Case: O(n^2) 
Worst Case: O(n^2) 
Average Case: O(n^2) 

Space Complexity:
O(1): Selection sort is an in-place sorting algorithm as it only requires a constant amount of additional memory space for the swapping of elements.
*/

import java.util.*;
public class A_Selection_Sort {
    public static void selectionSort(int[] arr) {
        
        for(int i=0;i<arr.length;i++)   
        {//arr.length array ka length find karne ke liye
            int min=arr[i];
            int index=-1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    index=j;
                }
            }
            if(index!=-1){
            int temp=arr[i];
            arr[i]=min;
            arr[index]=temp;
            }
        }
    }


public static void main(String[] args) {
       
        int[] arrayToSort = {64, 25, 12, 22, 11};
        
        System.out.println("Original Array: " + Arrays.toString(arrayToSort));
        //Arrays.toString is used to print the array in a readable format
        selectionSort(arrayToSort);
        System.out.println("Sorted Array: " + Arrays.toString(arrayToSort));
    }
}