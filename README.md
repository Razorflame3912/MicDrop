# MicDrop
Mansour Elsharawy, Irene Lam, Carol Pan

## QuickSort Timing Lab


## Assessment of QuickSort's Big-Oh runtime for: 

### Pivot point in Middle

Best Case: *Already Sorted*

O(nlogn) - Quick Sort will be called log(n) times, and will perform n comparisons/swaps collectively per level

Worst Case: (*follows this format - {... (n-2)th, (n-1)th, nth, 1st, 2nd, 3rd, 4th, ...} with 1st at the pivot*)

O(n\*n) - Quick Sort will be called n times, with n comparisons/swaps collectively per level.

Average Case is in between.

### Pivot point as the largest or smallest number of the array

Best Case: *sorted in correct order*

O(n\*n) - Quick Sort is called n times, and performs n(n-1)/2 swaps and comparisons (total)

Worst Case: *sorted in reverse order*

O(n\*n) - Quick Sort is called n times, and performs n swaps/comparisons collectively

### General Case

Best Case: When the pivot partitions the array into two parts of similar, if not the same, sizes. 
Run Time Analysis: Divide and conquer on each half would be log2(n), and partition requires linear time, so the total time would be O(nlogn)

Worst Case: When the pivot splits the array into parts of size 0 and array.length - 1. 
Run Time Analysis: Each recursive call would be the size of the previous list minus one. But because partition also runs in linear time, the algorithm would have a runtime of O(n^2)
 


## Method of Testing:

1 - Added a general, unprinted test that "warms up" the file such that it prevents just-in-time optimization (JIT)
2 - Ran QuickSort on arrays of different size n (1, 10, 100, 1000, 10000, 100000) in multiple 1000 element batches
3 - Averaged the results.

## Time: 

n = 1:      5.733 ns
n = 10:     506.055 ns
n = 100:    8322.598 ns
n = 1000:   105081.703 ns
n = 10000:  1215392.038 ns
n = 100000: 19174942.643 ns

