# MicDrop
## QuickSort Timing Lab


## Assessment of QuickSort's Big-Oh runtime for: 

### Pivot point in Middle
Best Case: *Already Sorted*
O(nlogn) - Quick Sort will be called log(n) times, and will perform n comparisons/swaps collectively per level
Worst Case: (*follows this format - {... (n-2)th, (n-1)th, nth, 1st, 2nd, 3rd, 4th, ...} with 1st at the pivot*)
O(n\*n) - Quick Sort will be called n times, with n comparisons/swaps collectively per level.
Average Case is in between.

### Pivot point at the extreme
(1st element are cuurent array)
Best Case: *sorted in correct order*
O(n\*n) - Quick Sort is called n times, and performs n(n-1)/2 swaps and comparisons (total)
Worst Case: *sorted in reverse order*
O(n\*n) - Quick Sort is called n times, and performs n swaps/comparisons collectively

## Method of Testing:
We ran QuickSort on arrays of different size n in multiple batches, and averaged the results

## Time: 
(summary, more detailed in QuickSort Tester block comment)

