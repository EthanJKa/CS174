import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
	//Some test code
	//added some more test code
	ArraySwap swapper = new ArraySwap();
	int[] a = {1, 2, 3};
	int[] b = {4, 5, 6};
	System.out.println(swapper.arrayEquals(a,b));
	System.out.println(swapper.arrayValuesEqual(a,b));
	swapper.swap(a,b);
	System.out.println();

	Person x = new Person("George", 67);
	Person y = new Person("Albert", 89);
	System.out.println(swapper.sameName(x,y));
	
	int[] arr = {1, 1, 2, 3, 4, 1, 5, 6, 8, 7, 9, 9 , 8, 9, 1};
	Arrays.sort(arr);
	ArraySwap c = new ArraySwap();
	for (int i : arr){
	    System.out.print(i);
	}
	System.out.println();
	arr = c.removeDuplicates(arr);
	for(Integer i : arr) {
	    System.out.print(i);
	}
	System.out.println();
	
    }

    /*
      Return true if the values in a are the same as the values in b
     */
    public boolean arrayValuesEqual(int[] a, int[] b) {
	int numValuesEqual = 0;
	//going to assume arrays are equal in length
	for(int i = 0; i <=a.length - 1; i++){
	    if(a[i] == b[i]){
		numValuesEqual++;
	    }
	}
	if(numValuesEqual == a.length){
	    return true;
	}else{
	    return false;
	}
    }
    /*
      Return true if a and b point to the same array
     */
    public boolean arrayEquals(int[] a, int[] b) {
	if(a == b){
	    return true;
	}else{
	    return false;
	}
    }

    /*
     * Swap a and b WITHOUT doing an elementwise copy.
     */
    public void swap(int[] a, int[] b) {
	//swaps arrays, but not "permanently"
	//as in, outside the method the arrays remain as they originally were
	int[] aTemp = a;
	a = b;
	b = aTemp;
	for(int i : a){
	    System.out.print(i + ", ");
	}
	System.out.println();
	for(int i : b){
	    System.out.print(i + ", ");
	}
	System.out.println();
    }


    /*
     * Returns true if a and b have the same name
     */

    public boolean sameName(Person a, Person b) {
	if (a.getName().equals(b.getName())){
	    return true;
	}else{
	    return false;
	}
    }


    /*
     * Given an array of positive integers, removes duplicates
     * in the array.
     * @return a contiguous array with the remaining integers 
     * with a length equal to the number of remaining integers
     */
    public int[] removeDuplicates(int[] integers) {
	int newArraySize = 1;
	Arrays.sort(integers);
	for(int i = 0; i < integers.length - 1; i++){
	    if(integers[i] != integers[i + 1]){
		newArraySize++;
	    }
	}
	int[] newArray = new int[newArraySize];
	int whereWeAre = 0;
	for(int x = 0; x < integers.length - 1; x++){
	    if(whereWeAre < newArraySize){
		if(integers[x] != integers[x + 1]){
		    newArray[whereWeAre] = integers[x];
		    whereWeAre++;
		}
	    }
	}
	newArray[whereWeAre] = integers[integers.length - 1];
	return newArray; 
    }
}


