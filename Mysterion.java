//Mansour Elsharawy
//APCS2 pd5
//HW13 -- We Be Dem
//2017-03-06   


public class Mysterion{

    public static void swap(int a, int b, int[] arr){
	int val = arr[a];
	arr[a] = arr[b];
	arr[b] = val;
    }

    public static String arrString(int[] arr){
	String retStr = "";
	for(int x = 0; x < arr.length; x++){
	    retStr += (arr[x] + " ");
	}
	return retStr;
    }
    
    /*Method quickSortPass:
     *Takes a beginning index, an ending index, a divider index, and an array.
     *Moves all values in between the beginning and ending indeces according to their position relative to the value at the divider index.
     *E.g. All numbers smaller than arr[div] are moved to the left of ut, all number larger are moved to the right.
     *The values moved however, are not necessarily sorted, just grouped.
     */
    public static int quickSortPass(int begin, int end, int divider, int[] arr){
	int v =  arr[divider];
	swap(divider,end,arr);
	int s = begin;
	for(int i = begin; i <= end - 1; i++){
	    if(arr[i] < v){
		swap(s,i,arr);
		s++;
	    }
	    
	}
	swap(end,s,arr);
	return s;
    }

    

    public static void main(String[] args){
	int[] foo = {3,0,16,599,1024};
	System.out.println(arrString(foo));
	System.out.println(quickSortPass(0,4,2,foo));
	System.out.println(arrString(foo));
	int[] foo2 = {3,222,10,5,19,1,0,};
	System.out.println(arrString(foo2));
	System.out.println(quickSortPass(0,6,3,foo2));
	System.out.println(arrString(foo2));
	
	
	
    }
}
