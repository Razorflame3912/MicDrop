//Mansour Elsharawy
//APCS2 pd5
//HW15 -- So So Quick
//2017-03-09   



/*****************************************************
 * class QuickSort
 *
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): Run partition with the middle index as the pivot. Recursively call quickSort
 * on the two sides of the pivot until sorted.
 * 2a. Worst pivot choice / array state and associated runtime: 
 * The worst pivot choice would be constantly picking the largest or smallest value as your pivot point, and an array arrangement where such is the case would have a runtime of n^2.
 * 2b. Best pivot choice / array state and associated runtime:
 * The best is picking the exact middle value as the pivot point every time (i.e. already sorted. Runtime of nlogn.
 * 3. Approach to handling duplicate values in array:
 * Partition already takes care of it :)
 *****************************************************/

/***
    PROTIP: Assume no duplicates during initial development phase.
    Once you have a working implementation, test against arrays 
    with duplicate values, and revise if necessary. (Backup first.)
 ***/

public class QuickSort 
{
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o ) {
	int tmp = o[x];
	o[x] = o[y];
	o[y] = tmp;
    }

    //print input array 
    public static void printArr( int[] a ) {
	for ( int o : a )
	    System.out.print( o + " " );
	System.out.println();
    }

    //shuffle elements of input array
    public static void shuffle( int[] d ) {
	int tmp;
	int swapPos;
	for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
	}
    }

    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    }
    //--------------^  HELPER METHODS  ^--------------



    /*****************************************************
     * void qsort(int[])
     * @param d -- array of ints to be sorted in place
     *****************************************************/
    public static void qsort( int[] d ) 
    { 
	qsortH(d,0,d.length-1);
    }

    // Thinkers are encouraged to roll their own subroutines.
    // Insert your auxiliary helper methods here.

     public static void qsortH(int[] arr,int left,int right){
	if(left < right){
	    int pvtPos = Mysterion.quickSortPass(left, right, (left+right)/2, arr);
	    qsortH(arr, left, pvtPos-1);
	    qsortH(arr, pvtPos+1, right);
	}
    }


    //main method for testing
    public static void main( String[] args ) 
    {

	//get-it-up-and-running, static test case:
	int [] arr1 = {7,1,5,12,3};
	System.out.println("\narr1 init'd to: " );
	printArr(arr1);

	qsort( arr1 );	
       	System.out.println("arr1 after qsort: " );
	printArr(arr1);

	// randomly-generated arrays of n distinct vals
	int[] arrN = new int[10];
	for( int i = 0; i < arrN.length; i++ )
	    arrN[i] = i;
       
	System.out.println("\narrN init'd to: " );
	printArr(arrN);

       	shuffle(arrN);
       	System.out.println("arrN post-shuffle: " );
	printArr(arrN);

	qsort( arrN );
	System.out.println("arrN after sort: " );
	printArr(arrN);
		/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 

	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/



	//get-it-up-and-running, static test case w/ dupes:
	int [] arr2 = {7,1,5,12,3,7};
	System.out.println("\narr2 init'd to: " );
	printArr(arr2);

	qsort( arr2 );	
       	System.out.println("arr2 after qsort: " );
	printArr(arr2);


	// arrays of randomly generated ints
	int[] arrMatey = new int[20];
	for( int i = 0; i < arrMatey.length; i++ )
	    arrMatey[i] = (int)( 48 * Math.random() );
       
	System.out.println("\narrMatey init'd to: " );
	printArr(arrMatey);

       	shuffle(arrMatey);
       	System.out.println("arrMatey post-shuffle: " );
	printArr(arrMatey);

	qsort( arrMatey );
	System.out.println("arrMatey after sort: " );
	printArr(arrMatey);
		/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 

	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    }//end main

}//end class QuickSort
